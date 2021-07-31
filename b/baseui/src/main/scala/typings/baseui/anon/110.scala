package typings.baseui.anon

import typings.baseui.baseuiStrings.LV
import typings.baseui.baseuiStrings.Plussign371
import typings.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var dialCode: Plussign371
  
  var id: LV
  
  var label: `Latvia LeftparenthesisLatvijaRightparenthesis`
}
object `110` {
  
  @scala.inline
  def apply(): `110` = {
    val __obj = js.Dynamic.literal(dialCode = "+371", id = "LV", label = "Latvia (Latvija)")
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign371): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
