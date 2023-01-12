package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedDate extends StObject {
  
  var isSelected: Boolean
  
  var timestamp: Double
}
object SelectedDate {
  
  inline def apply(isSelected: Boolean, timestamp: Double): SelectedDate = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedDate] (val x: Self) extends AnyVal {
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
