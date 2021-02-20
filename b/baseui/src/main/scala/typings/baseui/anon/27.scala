package typings.baseui.anon

import typings.baseui.baseuiStrings.BF
import typings.baseui.baseuiStrings.Plussign226
import typings.baseui.baseuiStrings.`Burkina Faso`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `27` extends StObject {
  
  var dialCode: Plussign226 = js.native
  
  var id: BF = js.native
  
  var label: `Burkina Faso` = js.native
}
object `27` {
  
  @scala.inline
  def apply(dialCode: Plussign226, id: BF, label: `Burkina Faso`): `27` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit class `27MutableBuilder`[Self <: `27`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign226): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Burkina Faso`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
