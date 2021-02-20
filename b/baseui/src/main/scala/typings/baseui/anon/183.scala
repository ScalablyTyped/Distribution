package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign221
import typings.baseui.baseuiStrings.SN
import typings.baseui.baseuiStrings.`Senegal LeftparenthesisSénégalRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `183` extends StObject {
  
  var dialCode: Plussign221 = js.native
  
  var id: SN = js.native
  
  var label: `Senegal LeftparenthesisSénégalRightparenthesis` = js.native
}
object `183` {
  
  @scala.inline
  def apply(dialCode: Plussign221, id: SN, label: `Senegal LeftparenthesisSénégalRightparenthesis`): `183` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`183`]
  }
  
  @scala.inline
  implicit class `183MutableBuilder`[Self <: `183`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign221): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Senegal LeftparenthesisSénégalRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
