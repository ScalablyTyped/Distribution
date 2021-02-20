package typings.baseui.anon

import typings.baseui.baseuiStrings.CH
import typings.baseui.baseuiStrings.Plussign41
import typings.baseui.baseuiStrings.`Switzerland LeftparenthesisSchweizRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `203` extends StObject {
  
  var dialCode: Plussign41 = js.native
  
  var id: CH = js.native
  
  var label: `Switzerland LeftparenthesisSchweizRightparenthesis` = js.native
}
object `203` {
  
  @scala.inline
  def apply(dialCode: Plussign41, id: CH, label: `Switzerland LeftparenthesisSchweizRightparenthesis`): `203` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit class `203MutableBuilder`[Self <: `203`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign41): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Switzerland LeftparenthesisSchweizRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
