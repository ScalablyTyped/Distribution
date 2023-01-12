package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Element traversal options for dealing with Shadow DOM
  */
trait Shadow extends StObject {
  
  /**
    * Include shadow DOM in search
    *
    * @default: false
    */
  var includeShadowDom: Boolean
}
object Shadow {
  
  inline def apply(includeShadowDom: Boolean): Shadow = {
    val __obj = js.Dynamic.literal(includeShadowDom = includeShadowDom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
  }
}
