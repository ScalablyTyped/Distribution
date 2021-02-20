package typings.baseui.anon

import typings.baseui.baseuiStrings.IE
import typings.baseui.baseuiStrings.Ireland
import typings.baseui.baseuiStrings.Plussign353
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `95` extends StObject {
  
  var dialCode: Plussign353 = js.native
  
  var id: IE = js.native
  
  var label: Ireland = js.native
}
object `95` {
  
  @scala.inline
  def apply(dialCode: Plussign353, id: IE, label: Ireland): `95` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit class `95MutableBuilder`[Self <: `95`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign353): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Ireland): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
