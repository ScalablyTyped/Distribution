package typings.baseui.anon

import typings.baseui.baseuiStrings.MG
import typings.baseui.baseuiStrings.Plussign261
import typings.baseui.baseuiStrings.`Madagascar LeftparenthesisMadagasikaraRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `120` extends StObject {
  
  var dialCode: Plussign261 = js.native
  
  var id: MG = js.native
  
  var label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis` = js.native
}
object `120` {
  
  @scala.inline
  def apply(dialCode: Plussign261, id: MG, label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): `120` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit class `120MutableBuilder`[Self <: `120`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign261): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
