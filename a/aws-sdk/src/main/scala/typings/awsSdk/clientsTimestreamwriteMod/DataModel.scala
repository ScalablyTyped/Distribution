package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModel extends StObject {
  
  /**
    * Source to target mappings for dimensions.
    */
  var DimensionMappings: typings.awsSdk.clientsTimestreamwriteMod.DimensionMappings
  
  /**
    * 
    */
  var MeasureNameColumn: js.UndefOr[StringValue256] = js.undefined
  
  /**
    * Source to target mappings for measures.
    */
  var MixedMeasureMappings: js.UndefOr[MixedMeasureMappingList] = js.undefined
  
  /**
    * Source to target mappings for multi-measure records.
    */
  var MultiMeasureMappings: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.MultiMeasureMappings] = js.undefined
  
  /**
    * Source column to be mapped to time.
    */
  var TimeColumn: js.UndefOr[StringValue256] = js.undefined
  
  /**
    *  The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds, or other supported values. Default is MILLISECONDS. 
    */
  var TimeUnit: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.TimeUnit] = js.undefined
}
object DataModel {
  
  inline def apply(DimensionMappings: DimensionMappings): DataModel = {
    val __obj = js.Dynamic.literal(DimensionMappings = DimensionMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModel] (val x: Self) extends AnyVal {
    
    inline def setDimensionMappings(value: DimensionMappings): Self = StObject.set(x, "DimensionMappings", value.asInstanceOf[js.Any])
    
    inline def setDimensionMappingsVarargs(value: DimensionMapping*): Self = StObject.set(x, "DimensionMappings", js.Array(value*))
    
    inline def setMeasureNameColumn(value: StringValue256): Self = StObject.set(x, "MeasureNameColumn", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameColumnUndefined: Self = StObject.set(x, "MeasureNameColumn", js.undefined)
    
    inline def setMixedMeasureMappings(value: MixedMeasureMappingList): Self = StObject.set(x, "MixedMeasureMappings", value.asInstanceOf[js.Any])
    
    inline def setMixedMeasureMappingsUndefined: Self = StObject.set(x, "MixedMeasureMappings", js.undefined)
    
    inline def setMixedMeasureMappingsVarargs(value: MixedMeasureMapping*): Self = StObject.set(x, "MixedMeasureMappings", js.Array(value*))
    
    inline def setMultiMeasureMappings(value: MultiMeasureMappings): Self = StObject.set(x, "MultiMeasureMappings", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureMappingsUndefined: Self = StObject.set(x, "MultiMeasureMappings", js.undefined)
    
    inline def setTimeColumn(value: StringValue256): Self = StObject.set(x, "TimeColumn", value.asInstanceOf[js.Any])
    
    inline def setTimeColumnUndefined: Self = StObject.set(x, "TimeColumn", js.undefined)
    
    inline def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "TimeUnit", js.undefined)
  }
}
