package typings.baseui.anon

import typings.baseui.baseuiStrings.Mayotte
import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `130` extends StObject {
  
  var dialCode: Plussign262 = js.native
  
  var id: YT = js.native
  
  var label: Mayotte = js.native
}
object `130` {
  
  @scala.inline
  def apply(dialCode: Plussign262, id: YT, label: Mayotte): `130` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit class `130MutableBuilder`[Self <: `130`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: YT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Mayotte): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
