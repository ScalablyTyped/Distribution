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
  
  @scala.inline
  def apply(): `91` = {
    val __obj = js.Dynamic.literal(dialCode = "+91", id = "IN", label = "India (\u092D\u093E\u0930\u0924)")
    __obj.asInstanceOf[`91`]
  }
  
  @scala.inline
  implicit class `91MutableBuilder`[Self <: `91`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign91): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `India LeftparenthesisभारतRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
