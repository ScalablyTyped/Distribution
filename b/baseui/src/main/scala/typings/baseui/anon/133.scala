package typings.baseui.anon

import typings.baseui.baseuiStrings.MD
import typings.baseui.baseuiStrings.Plussign373
import typings.baseui.baseuiStrings.`Moldova LeftparenthesisRepublica MoldovaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var dialCode: Plussign373
  
  var id: MD
  
  var label: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`
}
object `133` {
  
  @scala.inline
  def apply(): `133` = {
    val __obj = js.Dynamic.literal(dialCode = "+373", id = "MD", label = "Moldova (Republica Moldova)")
    __obj.asInstanceOf[`133`]
  }
  
  @scala.inline
  implicit class `133MutableBuilder`[Self <: `133`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign373): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
