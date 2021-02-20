package typings.baseui.anon

import typings.baseui.baseuiStrings.CU
import typings.baseui.baseuiStrings.Cuba
import typings.baseui.baseuiStrings.Plussign53
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `48` extends StObject {
  
  var dialCode: Plussign53 = js.native
  
  var id: CU = js.native
  
  var label: Cuba = js.native
}
object `48` {
  
  @scala.inline
  def apply(dialCode: Plussign53, id: CU, label: Cuba): `48` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit class `48MutableBuilder`[Self <: `48`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign53): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Cuba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
