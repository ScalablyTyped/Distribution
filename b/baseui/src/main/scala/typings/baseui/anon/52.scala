package typings.baseui.anon

import typings.baseui.baseuiStrings.DK
import typings.baseui.baseuiStrings.Plussign45
import typings.baseui.baseuiStrings.`Denmark LeftparenthesisDanmarkRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `52` extends StObject {
  
  var dialCode: Plussign45 = js.native
  
  var id: DK = js.native
  
  var label: `Denmark LeftparenthesisDanmarkRightparenthesis` = js.native
}
object `52` {
  
  @scala.inline
  def apply(dialCode: Plussign45, id: DK, label: `Denmark LeftparenthesisDanmarkRightparenthesis`): `52` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`52`]
  }
  
  @scala.inline
  implicit class `52MutableBuilder`[Self <: `52`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign45): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Denmark LeftparenthesisDanmarkRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
