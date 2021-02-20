package typings.baseui.anon

import typings.baseui.baseuiStrings.KY
import typings.baseui.baseuiStrings.Plussign1345
import typings.baseui.baseuiStrings.`Cayman Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `33` extends StObject {
  
  var dialCode: Plussign1345 = js.native
  
  var id: KY = js.native
  
  var label: `Cayman Islands` = js.native
}
object `33` {
  
  @scala.inline
  def apply(dialCode: Plussign1345, id: KY, label: `Cayman Islands`): `33` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit class `33MutableBuilder`[Self <: `33`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1345): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cayman Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
