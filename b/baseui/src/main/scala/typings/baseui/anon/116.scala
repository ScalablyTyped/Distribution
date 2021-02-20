package typings.baseui.anon

import typings.baseui.baseuiStrings.LT
import typings.baseui.baseuiStrings.Plussign370
import typings.baseui.baseuiStrings.`Lithuania LeftparenthesisLietuvaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `116` extends StObject {
  
  var dialCode: Plussign370 = js.native
  
  var id: LT = js.native
  
  var label: `Lithuania LeftparenthesisLietuvaRightparenthesis` = js.native
}
object `116` {
  
  @scala.inline
  def apply(dialCode: Plussign370, id: LT, label: `Lithuania LeftparenthesisLietuvaRightparenthesis`): `116` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`116`]
  }
  
  @scala.inline
  implicit class `116MutableBuilder`[Self <: `116`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign370): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Lithuania LeftparenthesisLietuvaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
