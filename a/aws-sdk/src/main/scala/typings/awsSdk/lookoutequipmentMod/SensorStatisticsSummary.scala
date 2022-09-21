package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorStatisticsSummary extends StObject {
  
  /**
    *  Parameter that describes potential risk about whether data associated with the sensor is categorical. 
    */
  var CategoricalValues: js.UndefOr[typings.awsSdk.lookoutequipmentMod.CategoricalValues] = js.undefined
  
  /**
    *  Name of the component to which the particular sensor belongs for which the statistics belong to. 
    */
  var ComponentName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ComponentName] = js.undefined
  
  /**
    *  Indicates the time reference to indicate the end of valid data associated with the sensor that the statistics belong to. 
    */
  var DataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Parameter that indicates whether data exists for the sensor that the statistics belong to. 
    */
  var DataExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates the time reference to indicate the beginning of valid data associated with the sensor that the statistics belong to. 
    */
  var DataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Parameter that describes the total number of duplicate timestamp records associated with the sensor that the statistics belong to. 
    */
  var DuplicateTimestamps: js.UndefOr[CountPercent] = js.undefined
  
  /**
    *  Parameter that describes the total number of invalid date entries associated with the sensor that the statistics belong to. 
    */
  var InvalidDateEntries: js.UndefOr[CountPercent] = js.undefined
  
  /**
    *  Parameter that describes the total number of, and percentage of, values that are invalid for the sensor that the statistics belong to. 
    */
  var InvalidValues: js.UndefOr[CountPercent] = js.undefined
  
  /**
    *  Parameter that describes potential risk about whether data associated with the sensor contains one or more large gaps between consecutive timestamps. 
    */
  var LargeTimestampGaps: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LargeTimestampGaps] = js.undefined
  
  /**
    *  Parameter that describes the total number of, and percentage of, values that are missing for the sensor that the statistics belong to. 
    */
  var MissingValues: js.UndefOr[CountPercent] = js.undefined
  
  /**
    *  Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic. 
    */
  var MonotonicValues: js.UndefOr[typings.awsSdk.lookoutequipmentMod.MonotonicValues] = js.undefined
  
  /**
    *  Parameter that describes potential risk about whether data associated with the sensor has more than one operating mode. 
    */
  var MultipleOperatingModes: js.UndefOr[typings.awsSdk.lookoutequipmentMod.MultipleOperatingModes] = js.undefined
  
  /**
    *  Name of the sensor that the statistics belong to. 
    */
  var SensorName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.SensorName] = js.undefined
}
object SensorStatisticsSummary {
  
  inline def apply(): SensorStatisticsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensorStatisticsSummary]
  }
  
  extension [Self <: SensorStatisticsSummary](x: Self) {
    
    inline def setCategoricalValues(value: CategoricalValues): Self = StObject.set(x, "CategoricalValues", value.asInstanceOf[js.Any])
    
    inline def setCategoricalValuesUndefined: Self = StObject.set(x, "CategoricalValues", js.undefined)
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "ComponentName", js.undefined)
    
    inline def setDataEndTime(value: js.Date): Self = StObject.set(x, "DataEndTime", value.asInstanceOf[js.Any])
    
    inline def setDataEndTimeUndefined: Self = StObject.set(x, "DataEndTime", js.undefined)
    
    inline def setDataExists(value: Boolean): Self = StObject.set(x, "DataExists", value.asInstanceOf[js.Any])
    
    inline def setDataExistsUndefined: Self = StObject.set(x, "DataExists", js.undefined)
    
    inline def setDataStartTime(value: js.Date): Self = StObject.set(x, "DataStartTime", value.asInstanceOf[js.Any])
    
    inline def setDataStartTimeUndefined: Self = StObject.set(x, "DataStartTime", js.undefined)
    
    inline def setDuplicateTimestamps(value: CountPercent): Self = StObject.set(x, "DuplicateTimestamps", value.asInstanceOf[js.Any])
    
    inline def setDuplicateTimestampsUndefined: Self = StObject.set(x, "DuplicateTimestamps", js.undefined)
    
    inline def setInvalidDateEntries(value: CountPercent): Self = StObject.set(x, "InvalidDateEntries", value.asInstanceOf[js.Any])
    
    inline def setInvalidDateEntriesUndefined: Self = StObject.set(x, "InvalidDateEntries", js.undefined)
    
    inline def setInvalidValues(value: CountPercent): Self = StObject.set(x, "InvalidValues", value.asInstanceOf[js.Any])
    
    inline def setInvalidValuesUndefined: Self = StObject.set(x, "InvalidValues", js.undefined)
    
    inline def setLargeTimestampGaps(value: LargeTimestampGaps): Self = StObject.set(x, "LargeTimestampGaps", value.asInstanceOf[js.Any])
    
    inline def setLargeTimestampGapsUndefined: Self = StObject.set(x, "LargeTimestampGaps", js.undefined)
    
    inline def setMissingValues(value: CountPercent): Self = StObject.set(x, "MissingValues", value.asInstanceOf[js.Any])
    
    inline def setMissingValuesUndefined: Self = StObject.set(x, "MissingValues", js.undefined)
    
    inline def setMonotonicValues(value: MonotonicValues): Self = StObject.set(x, "MonotonicValues", value.asInstanceOf[js.Any])
    
    inline def setMonotonicValuesUndefined: Self = StObject.set(x, "MonotonicValues", js.undefined)
    
    inline def setMultipleOperatingModes(value: MultipleOperatingModes): Self = StObject.set(x, "MultipleOperatingModes", value.asInstanceOf[js.Any])
    
    inline def setMultipleOperatingModesUndefined: Self = StObject.set(x, "MultipleOperatingModes", js.undefined)
    
    inline def setSensorName(value: SensorName): Self = StObject.set(x, "SensorName", value.asInstanceOf[js.Any])
    
    inline def setSensorNameUndefined: Self = StObject.set(x, "SensorName", js.undefined)
  }
}
