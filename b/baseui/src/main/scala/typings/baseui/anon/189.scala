package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign421
import typings.baseui.baseuiStrings.SK
import typings.baseui.baseuiStrings.`Slovakia LeftparenthesisSlovenskoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `189` extends StObject {
  
  var dialCode: Plussign421 = js.native
  
  var id: SK = js.native
  
  var label: `Slovakia LeftparenthesisSlovenskoRightparenthesis` = js.native
}
object `189` {
  
  @scala.inline
  def apply(dialCode: Plussign421, id: SK, label: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): `189` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit class `189MutableBuilder`[Self <: `189`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign421): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
