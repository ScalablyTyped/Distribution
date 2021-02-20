package typings.baseui.anon

import typings.baseui.baseuiStrings.CN
import typings.baseui.baseuiStrings.Plussign86
import typings.baseui.baseuiStrings.`China Leftparenthesis中国Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `37` extends StObject {
  
  var dialCode: Plussign86 = js.native
  
  var id: CN = js.native
  
  var label: `China Leftparenthesis中国Rightparenthesis` = js.native
}
object `37` {
  
  @scala.inline
  def apply(dialCode: Plussign86, id: CN, label: `China Leftparenthesis中国Rightparenthesis`): `37` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign86): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `China Leftparenthesis中国Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
