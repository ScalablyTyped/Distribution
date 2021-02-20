package typings.baseui.anon

import typings.baseui.baseuiStrings.FK
import typings.baseui.baseuiStrings.Plussign500
import typings.baseui.baseuiStrings.`Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `63` extends StObject {
  
  var dialCode: Plussign500 = js.native
  
  var id: FK = js.native
  
  var label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis` = js.native
}
object `63` {
  
  @scala.inline
  def apply(
    dialCode: Plussign500,
    id: FK,
    label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
  ): `63` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit class `63MutableBuilder`[Self <: `63`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign500): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
