package typings.baseui.anon

import typings.baseui.baseuiStrings.CK
import typings.baseui.baseuiStrings.Plussign682
import typings.baseui.baseuiStrings.`Cook Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `44` extends StObject {
  
  var dialCode: Plussign682 = js.native
  
  var id: CK = js.native
  
  var label: `Cook Islands` = js.native
}
object `44` {
  
  @scala.inline
  def apply(dialCode: Plussign682, id: CK, label: `Cook Islands`): `44` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit class `44MutableBuilder`[Self <: `44`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign682): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cook Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
