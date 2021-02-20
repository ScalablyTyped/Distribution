package typings.baseui.anon

import typings.baseui.baseuiStrings.MT
import typings.baseui.baseuiStrings.Malta
import typings.baseui.baseuiStrings.Plussign356
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `125` extends StObject {
  
  var dialCode: Plussign356 = js.native
  
  var id: MT = js.native
  
  var label: Malta = js.native
}
object `125` {
  
  @scala.inline
  def apply(dialCode: Plussign356, id: MT, label: Malta): `125` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit class `125MutableBuilder`[Self <: `125`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign356): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Malta): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
