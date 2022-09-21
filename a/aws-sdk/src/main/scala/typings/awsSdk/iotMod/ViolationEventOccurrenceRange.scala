package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolationEventOccurrenceRange extends StObject {
  
  /**
    *  The end date and time of a time period in which violation events occurred. 
    */
  var endTime: js.Date
  
  /**
    *  The start date and time of a time period in which violation events occurred. 
    */
  var startTime: js.Date
}
object ViolationEventOccurrenceRange {
  
  inline def apply(endTime: js.Date, startTime: js.Date): ViolationEventOccurrenceRange = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationEventOccurrenceRange]
  }
  
  extension [Self <: ViolationEventOccurrenceRange](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
