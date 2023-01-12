package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that check case sensitivity
  */
trait CaseMatchable extends StObject {
  
  /**
    * Check case sensitivity
    *
    * @default true
    */
  var matchCase: Boolean
}
object CaseMatchable {
  
  inline def apply(matchCase: Boolean): CaseMatchable = {
    val __obj = js.Dynamic.literal(matchCase = matchCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseMatchable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseMatchable] (val x: Self) extends AnyVal {
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
  }
}
