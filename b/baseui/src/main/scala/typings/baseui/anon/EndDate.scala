package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  @JSName("$disabled")
  var $disabled: Boolean
  
  @JSName("$endDate")
  var $endDate: Boolean
  
  @JSName("$range")
  var $range: Boolean
  
  @JSName("$selected")
  var $selected: Boolean
  
  @JSName("$startDate")
  var $startDate: Boolean
}
object EndDate {
  
  inline def apply($disabled: Boolean, $endDate: Boolean, $range: Boolean, $selected: Boolean, $startDate: Boolean): EndDate = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $endDate = $endDate.asInstanceOf[js.Any], $range = $range.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any], $startDate = $startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$endDate(value: Boolean): Self = StObject.set(x, "$endDate", value.asInstanceOf[js.Any])
    
    inline def set$range(value: Boolean): Self = StObject.set(x, "$range", value.asInstanceOf[js.Any])
    
    inline def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
    
    inline def set$startDate(value: Boolean): Self = StObject.set(x, "$startDate", value.asInstanceOf[js.Any])
  }
}
