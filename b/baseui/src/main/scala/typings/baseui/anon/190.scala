package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign386
import typings.baseui.baseuiStrings.SI
import typings.baseui.baseuiStrings.`Slovenia LeftparenthesisSlovenijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `190` extends StObject {
  
  var dialCode: Plussign386 = js.native
  
  var id: SI = js.native
  
  var label: `Slovenia LeftparenthesisSlovenijaRightparenthesis` = js.native
}
object `190` {
  
  @scala.inline
  def apply(dialCode: Plussign386, id: SI, label: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): `190` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`190`]
  }
  
  @scala.inline
  implicit class `190MutableBuilder`[Self <: `190`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign386): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
