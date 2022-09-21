package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangeFilter extends StObject {
  
  /**
    * A timestamp indicating the end date for the date range filter.
    */
  var endDateTime: js.Date
  
  /**
    * A timestamp indicating the start date for the date range filter.
    */
  var startDateTime: js.Date
}
object DateRangeFilter {
  
  inline def apply(endDateTime: js.Date, startDateTime: js.Date): DateRangeFilter = {
    val __obj = js.Dynamic.literal(endDateTime = endDateTime.asInstanceOf[js.Any], startDateTime = startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangeFilter]
  }
  
  extension [Self <: DateRangeFilter](x: Self) {
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
  }
}
