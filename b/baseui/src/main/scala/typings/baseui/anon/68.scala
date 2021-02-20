package typings.baseui.anon

import typings.baseui.baseuiStrings.GF
import typings.baseui.baseuiStrings.Plussign594
import typings.baseui.baseuiStrings.`French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `68` extends StObject {
  
  var dialCode: Plussign594 = js.native
  
  var id: GF = js.native
  
  var label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis` = js.native
}
object `68` {
  
  @scala.inline
  def apply(
    dialCode: Plussign594,
    id: GF,
    label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
  ): `68` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit class `68MutableBuilder`[Self <: `68`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign594): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
