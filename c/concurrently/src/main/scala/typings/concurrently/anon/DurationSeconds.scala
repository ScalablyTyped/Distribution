package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationSeconds extends StObject {
  
  var durationSeconds: Double
  
  var endDate: js.Date
  
  var startDate: js.Date
}
object DurationSeconds {
  
  inline def apply(durationSeconds: Double, endDate: js.Date, startDate: js.Date): DurationSeconds = {
    val __obj = js.Dynamic.literal(durationSeconds = durationSeconds.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationSeconds]
  }
  
  extension [Self <: DurationSeconds](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
