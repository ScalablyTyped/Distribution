package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign40
import typings.baseui.baseuiStrings.RO
import typings.baseui.baseuiStrings.`Romania LeftparenthesisRomâniaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `169` extends StObject {
  
  var dialCode: Plussign40 = js.native
  
  var id: RO = js.native
  
  var label: `Romania LeftparenthesisRomâniaRightparenthesis` = js.native
}
object `169` {
  
  @scala.inline
  def apply(dialCode: Plussign40, id: RO, label: `Romania LeftparenthesisRomâniaRightparenthesis`): `169` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit class `169MutableBuilder`[Self <: `169`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign40): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Romania LeftparenthesisRomâniaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
