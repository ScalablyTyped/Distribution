package typings.baseui.anon

import typings.baseui.baseuiStrings.BO
import typings.baseui.baseuiStrings.Bolivia
import typings.baseui.baseuiStrings.Plussign591
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19` extends StObject {
  
  var dialCode: Plussign591 = js.native
  
  var id: BO = js.native
  
  var label: Bolivia = js.native
}
object `19` {
  
  @scala.inline
  def apply(dialCode: Plussign591, id: BO, label: Bolivia): `19` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign591): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Bolivia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
