package typings.baseui.anon

import typings.baseui.baseuiStrings.JM
import typings.baseui.baseuiStrings.Jamaica
import typings.baseui.baseuiStrings.Plussign1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `99` extends StObject {
  
  var dialCode: Plussign1 = js.native
  
  var id: JM = js.native
  
  var label: Jamaica = js.native
}
object `99` {
  
  @scala.inline
  def apply(dialCode: Plussign1, id: JM, label: Jamaica): `99` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit class `99MutableBuilder`[Self <: `99`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: JM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Jamaica): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
