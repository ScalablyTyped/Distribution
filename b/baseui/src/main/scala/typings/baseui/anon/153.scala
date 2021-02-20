package typings.baseui.anon

import typings.baseui.baseuiStrings.MP
import typings.baseui.baseuiStrings.Plussign1670
import typings.baseui.baseuiStrings.`Northern Mariana Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `153` extends StObject {
  
  var dialCode: Plussign1670 = js.native
  
  var id: MP = js.native
  
  var label: `Northern Mariana Islands` = js.native
}
object `153` {
  
  @scala.inline
  def apply(dialCode: Plussign1670, id: MP, label: `Northern Mariana Islands`): `153` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit class `153MutableBuilder`[Self <: `153`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Northern Mariana Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
