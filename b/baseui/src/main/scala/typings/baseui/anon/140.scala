package typings.baseui.anon

import typings.baseui.baseuiStrings.MM
import typings.baseui.baseuiStrings.Plussign95
import typings.baseui.baseuiStrings.`Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `140` extends StObject {
  
  var dialCode: Plussign95 = js.native
  
  var id: MM = js.native
  
  var label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis` = js.native
}
object `140` {
  
  @scala.inline
  def apply(
    dialCode: Plussign95,
    id: MM,
    label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
  ): `140` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140MutableBuilder`[Self <: `140`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign95): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
