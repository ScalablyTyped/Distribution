package typings.baseui.anon

import typings.baseui.baseuiStrings.PR
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Puerto Rico`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `166` extends StObject {
  
  var dialCode: Plussign1 = js.native
  
  var id: PR = js.native
  
  var label: `Puerto Rico` = js.native
}
object `166` {
  
  @scala.inline
  def apply(dialCode: Plussign1, id: PR, label: `Puerto Rico`): `166` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit class `166MutableBuilder`[Self <: `166`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Puerto Rico`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
