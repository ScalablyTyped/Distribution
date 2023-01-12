package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WForgottenReturn extends StObject {
  
  /** Enables all warnings except forgotten return statements. */
  var wForgottenReturn: Boolean
}
object WForgottenReturn {
  
  inline def apply(wForgottenReturn: Boolean): WForgottenReturn = {
    val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WForgottenReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WForgottenReturn] (val x: Self) extends AnyVal {
    
    inline def setWForgottenReturn(value: Boolean): Self = StObject.set(x, "wForgottenReturn", value.asInstanceOf[js.Any])
  }
}
