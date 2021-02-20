package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign58
import typings.baseui.baseuiStrings.VE
import typings.baseui.baseuiStrings.Venezuela
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `229` extends StObject {
  
  var dialCode: Plussign58 = js.native
  
  var id: VE = js.native
  
  var label: Venezuela = js.native
}
object `229` {
  
  @scala.inline
  def apply(dialCode: Plussign58, id: VE, label: Venezuela): `229` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`229`]
  }
  
  @scala.inline
  implicit class `229MutableBuilder`[Self <: `229`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign58): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Venezuela): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
