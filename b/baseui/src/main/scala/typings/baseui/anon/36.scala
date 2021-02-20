package typings.baseui.anon

import typings.baseui.baseuiStrings.CL
import typings.baseui.baseuiStrings.Chile
import typings.baseui.baseuiStrings.Plussign56
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `36` extends StObject {
  
  var dialCode: Plussign56 = js.native
  
  var id: CL = js.native
  
  var label: Chile = js.native
}
object `36` {
  
  @scala.inline
  def apply(dialCode: Plussign56, id: CL, label: Chile): `36` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign56): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Chile): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
