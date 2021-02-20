package typings.baseui.anon

import typings.baseui.baseuiStrings.BY
import typings.baseui.baseuiStrings.Plussign375
import typings.baseui.baseuiStrings.`Belarus LeftparenthesisБеларусьRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends StObject {
  
  var dialCode: Plussign375 = js.native
  
  var id: BY = js.native
  
  var label: `Belarus LeftparenthesisБеларусьRightparenthesis` = js.native
}
object `13` {
  
  @scala.inline
  def apply(dialCode: Plussign375, id: BY, label: `Belarus LeftparenthesisБеларусьRightparenthesis`): `13` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign375): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Belarus LeftparenthesisБеларусьRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
