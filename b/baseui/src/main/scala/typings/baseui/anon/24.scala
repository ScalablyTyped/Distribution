package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1284
import typings.baseui.baseuiStrings.VG
import typings.baseui.baseuiStrings.`British Virgin Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `24` extends StObject {
  
  var dialCode: Plussign1284 = js.native
  
  var id: VG = js.native
  
  var label: `British Virgin Islands` = js.native
}
object `24` {
  
  @scala.inline
  def apply(dialCode: Plussign1284, id: VG, label: `British Virgin Islands`): `24` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1284): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `British Virgin Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
