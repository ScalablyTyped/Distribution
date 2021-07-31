package typings.baseui.anon

import typings.baseui.baseuiStrings.KG
import typings.baseui.baseuiStrings.Plussign996
import typings.baseui.baseuiStrings.`Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var dialCode: Plussign996
  
  var id: KG
  
  var label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`
}
object `108` {
  
  @scala.inline
  def apply(): `108` = {
    val __obj = js.Dynamic.literal(dialCode = "+996", id = "KG", label = "Kyrgyzstan (\u041A\u044B\u0440\u0433\u044B\u0437\u0441\u0442\u0430\u043D)")
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
