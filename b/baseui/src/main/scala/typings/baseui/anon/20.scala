package typings.baseui.anon

import typings.baseui.baseuiStrings.BA
import typings.baseui.baseuiStrings.Plussign387
import typings.baseui.baseuiStrings.`Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  var dialCode: Plussign387 = js.native
  
  var id: BA = js.native
  
  var label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis` = js.native
}
object `20` {
  
  @scala.inline
  def apply(
    dialCode: Plussign387,
    id: BA,
    label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
  ): `20` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign387): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
