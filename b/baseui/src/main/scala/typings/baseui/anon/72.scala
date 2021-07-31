package typings.baseui.anon

import typings.baseui.baseuiStrings.GE
import typings.baseui.baseuiStrings.Plussign995
import typings.baseui.baseuiStrings.`Georgia LeftparenthesisსაქართველოRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  var dialCode: Plussign995
  
  var id: GE
  
  var label: `Georgia LeftparenthesisსაქართველოRightparenthesis`
}
object `72` {
  
  @scala.inline
  def apply(): `72` = {
    val __obj = js.Dynamic.literal(dialCode = "+995", id = "GE", label = "Georgia (\u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD)")
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
