package typings.baseui.anon

import typings.baseui.baseuiStrings.IT
import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.`Italy LeftparenthesisItaliaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  var dialCode: Plussign39
  
  var id: IT
  
  var label: `Italy LeftparenthesisItaliaRightparenthesis`
}
object `98` {
  
  @scala.inline
  def apply(): `98` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "IT", label = "Italy (Italia)")
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit class `98MutableBuilder`[Self <: `98`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Italy LeftparenthesisItaliaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
