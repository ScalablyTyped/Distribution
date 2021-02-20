package typings.baseui.anon

import typings.baseui.baseuiStrings.IN
import typings.baseui.baseuiStrings.Plussign91
import typings.baseui.baseuiStrings.`India LeftparenthesisभारतRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `91` extends StObject {
  
  var dialCode: Plussign91 = js.native
  
  var id: IN = js.native
  
  var label: `India LeftparenthesisभारतRightparenthesis` = js.native
}
object `91` {
  
  @scala.inline
  def apply(dialCode: Plussign91, id: IN, label: `India LeftparenthesisभारतRightparenthesis`): `91` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
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
