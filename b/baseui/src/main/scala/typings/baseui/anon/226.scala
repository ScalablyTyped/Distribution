package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign998
import typings.baseui.baseuiStrings.UZ
import typings.baseui.baseuiStrings.`Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `226` extends StObject {
  
  var dialCode: Plussign998 = js.native
  
  var id: UZ = js.native
  
  var label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis` = js.native
}
object `226` {
  
  @scala.inline
  def apply(dialCode: Plussign998, id: UZ, label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): `226` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`226`]
  }
  
  @scala.inline
  implicit class `226MutableBuilder`[Self <: `226`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign998): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
