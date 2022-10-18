package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * Contains the list of dimensions for time series data points.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.Dimensions] = js.undefined
  
  /**
    * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or the RPM of a wind turbine are measures. 
    */
  var MeasureName: js.UndefOr[SchemaName] = js.undefined
  
  /**
    *  Contains the measure value for the time series data point. 
    */
  var MeasureValue: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    *  Contains the data type of the measure value for the time series data point. Default type is DOUBLE. 
    */
  var MeasureValueType: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.MeasureValueType] = js.undefined
  
  /**
    *  Contains the list of MeasureValue for time series data points.   This is only allowed for type MULTI. For scalar values, use MeasureValue attribute of the Record directly. 
    */
  var MeasureValues: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.MeasureValues] = js.undefined
  
  /**
    *  Contains the time at which the measure value for the data point was collected. The time value plus the unit provides the time elapsed since the epoch. For example, if the time value is 12345 and the unit is ms, then 12345 ms have elapsed since the epoch. 
    */
  var Time: js.UndefOr[StringValue256] = js.undefined
  
  /**
    *  The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or other supported values. Default is MILLISECONDS. 
    */
  var TimeUnit: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.TimeUnit] = js.undefined
  
  /**
    * 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number will update the existing measure value and version. In cases where the measure value is the same, Version will still be updated . Default value is 1.   Version must be 1 or greater, or you will receive a ValidationException error. 
    */
  var Version: js.UndefOr[RecordVersion] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMeasureName(value: SchemaName): Self = StObject.set(x, "MeasureName", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameUndefined: Self = StObject.set(x, "MeasureName", js.undefined)
    
    inline def setMeasureValue(value: StringValue2048): Self = StObject.set(x, "MeasureValue", value.asInstanceOf[js.Any])
    
    inline def setMeasureValueType(value: MeasureValueType): Self = StObject.set(x, "MeasureValueType", value.asInstanceOf[js.Any])
    
    inline def setMeasureValueTypeUndefined: Self = StObject.set(x, "MeasureValueType", js.undefined)
    
    inline def setMeasureValueUndefined: Self = StObject.set(x, "MeasureValue", js.undefined)
    
    inline def setMeasureValues(value: MeasureValues): Self = StObject.set(x, "MeasureValues", value.asInstanceOf[js.Any])
    
    inline def setMeasureValuesUndefined: Self = StObject.set(x, "MeasureValues", js.undefined)
    
    inline def setMeasureValuesVarargs(value: MeasureValue*): Self = StObject.set(x, "MeasureValues", js.Array(value*))
    
    inline def setTime(value: StringValue256): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
    
    inline def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "TimeUnit", js.undefined)
    
    inline def setVersion(value: RecordVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
