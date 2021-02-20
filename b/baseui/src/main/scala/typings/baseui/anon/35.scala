package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign235
import typings.baseui.baseuiStrings.TD
import typings.baseui.baseuiStrings.`Chad LeftparenthesisTchadRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `35` extends StObject {
  
  var dialCode: Plussign235 = js.native
  
  var id: TD = js.native
  
  var label: `Chad LeftparenthesisTchadRightparenthesis` = js.native
}
object `35` {
  
  @scala.inline
  def apply(dialCode: Plussign235, id: TD, label: `Chad LeftparenthesisTchadRightparenthesis`): `35` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign235): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Chad LeftparenthesisTchadRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
