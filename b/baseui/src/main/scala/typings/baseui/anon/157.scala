package typings.baseui.anon

import typings.baseui.baseuiStrings.PW
import typings.baseui.baseuiStrings.Palau
import typings.baseui.baseuiStrings.Plussign680
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `157` extends StObject {
  
  var dialCode: Plussign680 = js.native
  
  var id: PW = js.native
  
  var label: Palau = js.native
}
object `157` {
  
  @scala.inline
  def apply(dialCode: Plussign680, id: PW, label: Palau): `157` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit class `157MutableBuilder`[Self <: `157`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign680): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Palau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
