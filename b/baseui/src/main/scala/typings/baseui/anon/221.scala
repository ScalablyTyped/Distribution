package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign380
import typings.baseui.baseuiStrings.UA
import typings.baseui.baseuiStrings.`Ukraine LeftparenthesisУкраїнаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `221` extends StObject {
  
  var dialCode: Plussign380 = js.native
  
  var id: UA = js.native
  
  var label: `Ukraine LeftparenthesisУкраїнаRightparenthesis` = js.native
}
object `221` {
  
  @scala.inline
  def apply(dialCode: Plussign380, id: UA, label: `Ukraine LeftparenthesisУкраїнаRightparenthesis`): `221` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit class `221MutableBuilder`[Self <: `221`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign380): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Ukraine LeftparenthesisУкраїнаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
