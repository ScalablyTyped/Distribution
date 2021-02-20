package typings.baseui.anon

import typings.baseui.baseuiStrings.GE
import typings.baseui.baseuiStrings.Plussign995
import typings.baseui.baseuiStrings.`Georgia LeftparenthesisსაქართველოRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `72` extends StObject {
  
  var dialCode: Plussign995 = js.native
  
  var id: GE = js.native
  
  var label: `Georgia LeftparenthesisსაქართველოRightparenthesis` = js.native
}
object `72` {
  
  @scala.inline
  def apply(dialCode: Plussign995, id: GE, label: `Georgia LeftparenthesisსაქართველოRightparenthesis`): `72` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit class `72MutableBuilder`[Self <: `72`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign995): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Georgia LeftparenthesisსაქართველოRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
