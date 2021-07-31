package typings.baseui.anon

import typings.baseui.baseuiStrings.LC
import typings.baseui.baseuiStrings.Plussign1758
import typings.baseui.baseuiStrings.`Saint Lucia`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var dialCode: Plussign1758
  
  var id: LC
  
  var label: `Saint Lucia`
}
object `175` {
  
  @scala.inline
  def apply(): `175` = {
    val __obj = js.Dynamic.literal(dialCode = "+1758", id = "LC", label = "Saint Lucia")
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit class `175MutableBuilder`[Self <: `175`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1758): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Lucia`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
