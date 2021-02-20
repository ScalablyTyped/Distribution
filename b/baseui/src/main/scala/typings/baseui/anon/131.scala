package typings.baseui.anon

import typings.baseui.baseuiStrings.MX
import typings.baseui.baseuiStrings.Plussign52
import typings.baseui.baseuiStrings.`Mexico LeftparenthesisMéxicoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `131` extends StObject {
  
  var dialCode: Plussign52 = js.native
  
  var id: MX = js.native
  
  var label: `Mexico LeftparenthesisMéxicoRightparenthesis` = js.native
}
object `131` {
  
  @scala.inline
  def apply(dialCode: Plussign52, id: MX, label: `Mexico LeftparenthesisMéxicoRightparenthesis`): `131` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit class `131MutableBuilder`[Self <: `131`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign52): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mexico LeftparenthesisMéxicoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
