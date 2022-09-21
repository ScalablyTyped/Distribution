package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedDateDialogResult extends StObject {
  
  var buttonType: Double
  
  var selectedDates: js.Array[SelectedDate]
}
object AdvancedDateDialogResult {
  
  inline def apply(buttonType: Double, selectedDates: js.Array[SelectedDate]): AdvancedDateDialogResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedDateDialogResult]
  }
  
  extension [Self <: AdvancedDateDialogResult](x: Self) {
    
    inline def setButtonType(value: Double): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setSelectedDates(value: js.Array[SelectedDate]): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
    
    inline def setSelectedDatesVarargs(value: SelectedDate*): Self = StObject.set(x, "selectedDates", js.Array(value*))
  }
}
