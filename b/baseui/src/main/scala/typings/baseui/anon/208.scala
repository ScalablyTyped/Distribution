package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign66
import typings.baseui.baseuiStrings.TH
import typings.baseui.baseuiStrings.`Thailand LeftparenthesisไทยRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `208` extends StObject {
  
  var dialCode: Plussign66 = js.native
  
  var id: TH = js.native
  
  var label: `Thailand LeftparenthesisไทยRightparenthesis` = js.native
}
object `208` {
  
  @scala.inline
  def apply(dialCode: Plussign66, id: TH, label: `Thailand LeftparenthesisไทยRightparenthesis`): `208` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit class `208MutableBuilder`[Self <: `208`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign66): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Thailand LeftparenthesisไทยRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
