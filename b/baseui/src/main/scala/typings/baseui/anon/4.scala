package typings.baseui.anon

import typings.baseui.baseuiStrings.AM
import typings.baseui.baseuiStrings.Plussign374
import typings.baseui.baseuiStrings.`Armenia LeftparenthesisՀայաստանRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var dialCode: Plussign374 = js.native
  
  var id: AM = js.native
  
  var label: `Armenia LeftparenthesisՀայաստանRightparenthesis` = js.native
}
object `4` {
  
  @scala.inline
  def apply(dialCode: Plussign374, id: AM, label: `Armenia LeftparenthesisՀայաստանRightparenthesis`): `4` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign374): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Armenia LeftparenthesisՀայաստանRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
