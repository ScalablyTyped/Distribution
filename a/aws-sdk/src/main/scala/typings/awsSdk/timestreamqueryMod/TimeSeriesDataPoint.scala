package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesDataPoint extends StObject {
  
  /**
    * The timestamp when the measure value was collected.
    */
  var Time: Timestamp
  
  /**
    * The measure value for the data point.
    */
  var Value: Datum
}
object TimeSeriesDataPoint {
  
  inline def apply(Time: Timestamp, Value: Datum): TimeSeriesDataPoint = {
    val __obj = js.Dynamic.literal(Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesDataPoint]
  }
  
  extension [Self <: TimeSeriesDataPoint](x: Self) {
    
    inline def setTime(value: Timestamp): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Datum): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
