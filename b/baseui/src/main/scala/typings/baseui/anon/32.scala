package typings.baseui.anon

import typings.baseui.baseuiStrings.CV
import typings.baseui.baseuiStrings.Plussign238
import typings.baseui.baseuiStrings.`Cape Verde LeftparenthesisKabu VerdiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends StObject {
  
  var dialCode: Plussign238 = js.native
  
  var id: CV = js.native
  
  var label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis` = js.native
}
object `32` {
  
  @scala.inline
  def apply(dialCode: Plussign238, id: CV, label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): `32` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign238): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
