package typings.baseui.anon

import typings.baseui.baseuiStrings.LC
import typings.baseui.baseuiStrings.Plussign1758
import typings.baseui.baseuiStrings.`Saint Lucia`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `175` extends StObject {
  
  var dialCode: Plussign1758 = js.native
  
  var id: LC = js.native
  
  var label: `Saint Lucia` = js.native
}
object `175` {
  
  @scala.inline
  def apply(dialCode: Plussign1758, id: LC, label: `Saint Lucia`): `175` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit class `175MutableBuilder`[Self <: `175`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1758): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Lucia`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
