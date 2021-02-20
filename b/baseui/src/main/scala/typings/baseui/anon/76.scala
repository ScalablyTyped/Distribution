package typings.baseui.anon

import typings.baseui.baseuiStrings.GR
import typings.baseui.baseuiStrings.Plussign30
import typings.baseui.baseuiStrings.`Greece LeftparenthesisΕλλάδαRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `76` extends StObject {
  
  var dialCode: Plussign30 = js.native
  
  var id: GR = js.native
  
  var label: `Greece LeftparenthesisΕλλάδαRightparenthesis` = js.native
}
object `76` {
  
  @scala.inline
  def apply(dialCode: Plussign30, id: GR, label: `Greece LeftparenthesisΕλλάδαRightparenthesis`): `76` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign30): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Greece LeftparenthesisΕλλάδαRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
