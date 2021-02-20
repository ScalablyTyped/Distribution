package typings.baseui.anon

import typings.baseui.baseuiStrings.KZ
import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.`Kazakhstan LeftparenthesisКазахстанRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `103` extends StObject {
  
  var dialCode: Plussign7 = js.native
  
  var id: KZ = js.native
  
  var label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis` = js.native
}
object `103` {
  
  @scala.inline
  def apply(dialCode: Plussign7, id: KZ, label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): `103` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103MutableBuilder`[Self <: `103`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
