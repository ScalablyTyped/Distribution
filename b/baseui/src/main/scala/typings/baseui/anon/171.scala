package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign250
import typings.baseui.baseuiStrings.RW
import typings.baseui.baseuiStrings.Rwanda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `171` extends StObject {
  
  var dialCode: Plussign250 = js.native
  
  var id: RW = js.native
  
  var label: Rwanda = js.native
}
object `171` {
  
  @scala.inline
  def apply(dialCode: Plussign250, id: RW, label: Rwanda): `171` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`171`]
  }
  
  @scala.inline
  implicit class `171MutableBuilder`[Self <: `171`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign250): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Rwanda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
