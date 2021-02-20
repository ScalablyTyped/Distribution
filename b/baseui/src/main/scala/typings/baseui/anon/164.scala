package typings.baseui.anon

import typings.baseui.baseuiStrings.PL
import typings.baseui.baseuiStrings.Plussign48
import typings.baseui.baseuiStrings.`Poland LeftparenthesisPolskaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `164` extends StObject {
  
  var dialCode: Plussign48 = js.native
  
  var id: PL = js.native
  
  var label: `Poland LeftparenthesisPolskaRightparenthesis` = js.native
}
object `164` {
  
  @scala.inline
  def apply(dialCode: Plussign48, id: PL, label: `Poland LeftparenthesisPolskaRightparenthesis`): `164` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit class `164MutableBuilder`[Self <: `164`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign48): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Poland LeftparenthesisPolskaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
