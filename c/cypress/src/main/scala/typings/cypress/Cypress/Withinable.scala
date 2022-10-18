package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control how a command behaves in the `within` scope.
  * These options will determine how nodes are selected.
  */
trait Withinable extends StObject {
  
  /**
    * Element to search for children in. If null, search begins from root-level DOM element.
    *
    * @default depends on context, null if outside of within wrapper
    */
  var withinSubject: JQuery[HTMLElement] | HTMLElement | Null
}
object Withinable {
  
  inline def apply(): Withinable = {
    val __obj = js.Dynamic.literal(withinSubject = null)
    __obj.asInstanceOf[Withinable]
  }
  
  extension [Self <: Withinable](x: Self) {
    
    inline def setWithinSubject(value: JQuery[HTMLElement] | HTMLElement): Self = StObject.set(x, "withinSubject", value.asInstanceOf[js.Any])
    
    inline def setWithinSubjectNull: Self = StObject.set(x, "withinSubject", null)
  }
}
