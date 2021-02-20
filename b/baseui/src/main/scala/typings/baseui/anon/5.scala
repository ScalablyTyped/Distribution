package typings.baseui.anon

import typings.baseui.baseuiStrings.AW
import typings.baseui.baseuiStrings.Aruba
import typings.baseui.baseuiStrings.Plussign297
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var dialCode: Plussign297 = js.native
  
  var id: AW = js.native
  
  var label: Aruba = js.native
}
object `5` {
  
  @scala.inline
  def apply(dialCode: Plussign297, id: AW, label: Aruba): `5` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign297): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Aruba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
