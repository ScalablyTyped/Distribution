package typings.baseui.anon

import typings.baseui.baseuiStrings.IN
import typings.baseui.baseuiStrings.Plussign91
import typings.baseui.baseuiStrings.`India LeftparenthesisभारतRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var dialCode: Plussign91
  
  var id: IN
  
  var label: `India LeftparenthesisभारतRightparenthesis`
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal(dialCode = "+91", id = "IN", label = "India (\u092D\u093E\u0930\u0924)")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setDialCode(value: Plussign91): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `India LeftparenthesisभारतRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
