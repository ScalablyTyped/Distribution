package typings.baseui.anon

import typings.baseui.baseuiStrings.BD
import typings.baseui.baseuiStrings.Plussign880
import typings.baseui.baseuiStrings.`Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var dialCode: Plussign880
  
  var id: BD
  
  var label: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`
}
object `11` {
  
  @scala.inline
  def apply(): `11` = {
    val __obj = js.Dynamic.literal(dialCode = "+880", id = "BD", label = "Bangladesh (\u09AC\u09BE\u0982\u09B2\u09BE\u09A6\u09C7\u09B6)")
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign880): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
