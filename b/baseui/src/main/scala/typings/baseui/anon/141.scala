package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import typings.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `141` extends StObject {
  
  var dialCode: Plussign264 = js.native
  
  var id: NA = js.native
  
  var label: `Namibia LeftparenthesisNamibiëRightparenthesis` = js.native
}
object `141` {
  
  @scala.inline
  def apply(dialCode: Plussign264, id: NA, label: `Namibia LeftparenthesisNamibiëRightparenthesis`): `141` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit class `141MutableBuilder`[Self <: `141`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
