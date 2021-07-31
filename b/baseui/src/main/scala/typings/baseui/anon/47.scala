package typings.baseui.anon

import typings.baseui.baseuiStrings.HR
import typings.baseui.baseuiStrings.Plussign385
import typings.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var dialCode: Plussign385
  
  var id: HR
  
  var label: `Croatia LeftparenthesisHrvatskaRightparenthesis`
}
object `47` {
  
  @scala.inline
  def apply(): `47` = {
    val __obj = js.Dynamic.literal(dialCode = "+385", id = "HR", label = "Croatia (Hrvatska)")
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47MutableBuilder`[Self <: `47`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign385): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
