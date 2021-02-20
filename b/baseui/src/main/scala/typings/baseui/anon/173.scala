package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign290
import typings.baseui.baseuiStrings.SH
import typings.baseui.baseuiStrings.`Saint Helena`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `173` extends StObject {
  
  var dialCode: Plussign290 = js.native
  
  var id: SH = js.native
  
  var label: `Saint Helena` = js.native
}
object `173` {
  
  @scala.inline
  def apply(dialCode: Plussign290, id: SH, label: `Saint Helena`): `173` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit class `173MutableBuilder`[Self <: `173`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign290): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Helena`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
