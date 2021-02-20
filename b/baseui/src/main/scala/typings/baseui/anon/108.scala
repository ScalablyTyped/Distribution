package typings.baseui.anon

import typings.baseui.baseuiStrings.KG
import typings.baseui.baseuiStrings.Plussign996
import typings.baseui.baseuiStrings.`Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `108` extends StObject {
  
  var dialCode: Plussign996 = js.native
  
  var id: KG = js.native
  
  var label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis` = js.native
}
object `108` {
  
  @scala.inline
  def apply(dialCode: Plussign996, id: KG, label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): `108` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit class `108MutableBuilder`[Self <: `108`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign996): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
