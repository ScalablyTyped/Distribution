package typings.bootstrapSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeValue extends StObject {
  
  var newValue: Double = js.native
  
  var oldValue: Double = js.native
}
object ChangeValue {
  
  @scala.inline
  def apply(newValue: Double, oldValue: Double): ChangeValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeValue]
  }
  
  @scala.inline
  implicit class ChangeValueMutableBuilder[Self <: ChangeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
