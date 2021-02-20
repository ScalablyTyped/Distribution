package typings.baseui.anon

import typings.baseui.baseuiStrings.GW
import typings.baseui.baseuiStrings.Plussign245
import typings.baseui.baseuiStrings.`Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `84` extends StObject {
  
  var dialCode: Plussign245 = js.native
  
  var id: GW = js.native
  
  var label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis` = js.native
}
object `84` {
  
  @scala.inline
  def apply(dialCode: Plussign245, id: GW, label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): `84` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`84`]
  }
  
  @scala.inline
  implicit class `84MutableBuilder`[Self <: `84`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign245): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
