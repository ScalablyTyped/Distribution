package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign84
import typings.baseui.baseuiStrings.VN
import typings.baseui.baseuiStrings.`Vietnam LeftparenthesisViệt NamRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `230` extends StObject {
  
  var dialCode: Plussign84 = js.native
  
  var id: VN = js.native
  
  var label: `Vietnam LeftparenthesisViệt NamRightparenthesis` = js.native
}
object `230` {
  
  @scala.inline
  def apply(dialCode: Plussign84, id: VN, label: `Vietnam LeftparenthesisViệt NamRightparenthesis`): `230` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit class `230MutableBuilder`[Self <: `230`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign84): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
