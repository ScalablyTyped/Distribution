package typings.baseui.anon

import typings.baseui.baseuiStrings.IO
import typings.baseui.baseuiStrings.Plussign246
import typings.baseui.baseuiStrings.`British Indian Ocean Territory`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var dialCode: Plussign246 = js.native
  
  var id: IO = js.native
  
  var label: `British Indian Ocean Territory` = js.native
}
object `23` {
  
  @scala.inline
  def apply(dialCode: Plussign246, id: IO, label: `British Indian Ocean Territory`): `23` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `British Indian Ocean Territory`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
