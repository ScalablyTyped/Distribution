package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * Contains the list of dimensions for time series data points.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.timestreamwriteMod.Dimensions] = js.undefined
  
  /**
    * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or the RPM of a wind turbine are measures. 
    */
  var MeasureName: js.UndefOr[StringValue256] = js.undefined
  
  /**
    *  Contains the measure value for the time series data point. 
    */
  var MeasureValue: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    *  Contains the data type of the measure value for the time series data point. 
    */
  var MeasureValueType: js.UndefOr[typings.awsSdk.timestreamwriteMod.MeasureValueType] = js.undefined
  
  /**
    *  Contains the time at which the measure value for the data point was collected. 
    */
  var Time: js.UndefOr[StringValue256] = js.undefined
  
  /**
    *  The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or other supported values. 
    */
  var TimeUnit: js.UndefOr[typings.awsSdk.timestreamwriteMod.TimeUnit] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    inline def setMeasureName(value: StringValue256): Self = StObject.set(x, "MeasureName", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameUndefined: Self = StObject.set(x, "MeasureName", js.undefined)
    
    inline def setMeasureValue(value: StringValue2048): Self = StObject.set(x, "MeasureValue", value.asInstanceOf[js.Any])
    
    inline def setMeasureValueType(value: MeasureValueType): Self = StObject.set(x, "MeasureValueType", value.asInstanceOf[js.Any])
    
    inline def setMeasureValueTypeUndefined: Self = StObject.set(x, "MeasureValueType", js.undefined)
    
    inline def setMeasureValueUndefined: Self = StObject.set(x, "MeasureValue", js.undefined)
    
    inline def setTime(value: StringValue256): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
    
    inline def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "TimeUnit", js.undefined)
  }
}
