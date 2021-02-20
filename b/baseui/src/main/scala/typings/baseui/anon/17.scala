package typings.baseui.anon

import typings.baseui.baseuiStrings.BM
import typings.baseui.baseuiStrings.Bermuda
import typings.baseui.baseuiStrings.Plussign1441
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  var dialCode: Plussign1441 = js.native
  
  var id: BM = js.native
  
  var label: Bermuda = js.native
}
object `17` {
  
  @scala.inline
  def apply(dialCode: Plussign1441, id: BM, label: Bermuda): `17` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1441): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Bermuda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
