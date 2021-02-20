package typings.baseui.anon

import typings.baseui.baseuiStrings.NC
import typings.baseui.baseuiStrings.Plussign687
import typings.baseui.baseuiStrings.`New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145` extends StObject {
  
  var dialCode: Plussign687 = js.native
  
  var id: NC = js.native
  
  var label: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis` = js.native
}
object `145` {
  
  @scala.inline
  def apply(
    dialCode: Plussign687,
    id: NC,
    label: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
  ): `145` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit class `145MutableBuilder`[Self <: `145`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign687): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
