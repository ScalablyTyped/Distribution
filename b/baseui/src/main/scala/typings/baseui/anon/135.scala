package typings.baseui.anon

import typings.baseui.baseuiStrings.MN
import typings.baseui.baseuiStrings.Plussign976
import typings.baseui.baseuiStrings.`Mongolia LeftparenthesisМонголRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `135` extends StObject {
  
  var dialCode: Plussign976 = js.native
  
  var id: MN = js.native
  
  var label: `Mongolia LeftparenthesisМонголRightparenthesis` = js.native
}
object `135` {
  
  @scala.inline
  def apply(dialCode: Plussign976, id: MN, label: `Mongolia LeftparenthesisМонголRightparenthesis`): `135` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit class `135MutableBuilder`[Self <: `135`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign976): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mongolia LeftparenthesisМонголRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
