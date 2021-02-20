package typings.baseui.anon

import typings.baseui.baseuiStrings.FO
import typings.baseui.baseuiStrings.Plussign298
import typings.baseui.baseuiStrings.`Faroe Islands LeftparenthesisFøroyarRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `64` extends StObject {
  
  var dialCode: Plussign298 = js.native
  
  var id: FO = js.native
  
  var label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis` = js.native
}
object `64` {
  
  @scala.inline
  def apply(dialCode: Plussign298, id: FO, label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): `64` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64MutableBuilder`[Self <: `64`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign298): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
