package typings.baseui.anon

import typings.baseui.baseuiStrings.MK
import typings.baseui.baseuiStrings.Plussign389
import typings.baseui.baseuiStrings.`Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `119` extends StObject {
  
  var dialCode: Plussign389 = js.native
  
  var id: MK = js.native
  
  var label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis` = js.native
}
object `119` {
  
  @scala.inline
  def apply(
    dialCode: Plussign389,
    id: MK,
    label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
  ): `119` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit class `119MutableBuilder`[Self <: `119`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign389): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
