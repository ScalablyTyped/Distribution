package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign380
import typings.baseui.baseuiStrings.UA
import typings.baseui.baseuiStrings.`Ukraine LeftparenthesisУкраїнаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var dialCode: Plussign380
  
  var id: UA
  
  var label: `Ukraine LeftparenthesisУкраїнаRightparenthesis`
}
object `221` {
  
  @scala.inline
  def apply(): `221` = {
    val __obj = js.Dynamic.literal(dialCode = "+380", id = "UA", label = "Ukraine (\u0423\u043A\u0440\u0430\u0457\u043D\u0430)")
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit class `221MutableBuilder`[Self <: `221`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign380): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Ukraine LeftparenthesisУкраїнаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
