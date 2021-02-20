package typings.baseui.anon

import typings.baseui.baseuiStrings.DO
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `55` extends StObject {
  
  var dialCode: Plussign1 = js.native
  
  var id: DO = js.native
  
  var label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis` = js.native
}
object `55` {
  
  @scala.inline
  def apply(
    dialCode: Plussign1,
    id: DO,
    label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
  ): `55` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit class `55MutableBuilder`[Self <: `55`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
