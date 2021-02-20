package typings.baseui.anon

import typings.baseui.baseuiStrings.HR
import typings.baseui.baseuiStrings.Plussign385
import typings.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `47` extends StObject {
  
  var dialCode: Plussign385 = js.native
  
  var id: HR = js.native
  
  var label: `Croatia LeftparenthesisHrvatskaRightparenthesis` = js.native
}
object `47` {
  
  @scala.inline
  def apply(dialCode: Plussign385, id: HR, label: `Croatia LeftparenthesisHrvatskaRightparenthesis`): `47` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47MutableBuilder`[Self <: `47`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign385): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
