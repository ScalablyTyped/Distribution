package typings.baseui.anon

import typings.baseui.baseuiStrings.MP
import typings.baseui.baseuiStrings.Plussign1670
import typings.baseui.baseuiStrings.`Northern Mariana Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var dialCode: Plussign1670
  
  var id: MP
  
  var label: `Northern Mariana Islands`
}
object `153` {
  
  @scala.inline
  def apply(): `153` = {
    val __obj = js.Dynamic.literal(dialCode = "+1670", id = "MP", label = "Northern Mariana Islands")
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit class `153MutableBuilder`[Self <: `153`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Northern Mariana Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
