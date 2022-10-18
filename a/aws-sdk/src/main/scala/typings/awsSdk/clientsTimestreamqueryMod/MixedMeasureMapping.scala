package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedMeasureMapping extends StObject {
  
  /**
    * Refers to the value of measure_name in a result row. This field is required if MeasureNameColumn is provided.
    */
  var MeasureName: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * Type of the value that is to be read from sourceColumn. If the mapping is for MULTI, use MeasureValueType.MULTI.
    */
  var MeasureValueType: typings.awsSdk.clientsTimestreamqueryMod.MeasureValueType
  
  /**
    * Required when measureValueType is MULTI. Attribute mappings for MULTI value measures.
    */
  var MultiMeasureAttributeMappings: js.UndefOr[MultiMeasureAttributeMappingList] = js.undefined
  
  /**
    * This field refers to the source column from which measure-value is to be read for result materialization.
    */
  var SourceColumn: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * Target measure name to be used. If not provided, the target measure name by default would be measure-name if provided, or sourceColumn otherwise. 
    */
  var TargetMeasureName: js.UndefOr[SchemaName] = js.undefined
}
object MixedMeasureMapping {
  
  inline def apply(MeasureValueType: MeasureValueType): MixedMeasureMapping = {
    val __obj = js.Dynamic.literal(MeasureValueType = MeasureValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedMeasureMapping]
  }
  
  extension [Self <: MixedMeasureMapping](x: Self) {
    
    inline def setMeasureName(value: SchemaName): Self = StObject.set(x, "MeasureName", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameUndefined: Self = StObject.set(x, "MeasureName", js.undefined)
    
    inline def setMeasureValueType(value: MeasureValueType): Self = StObject.set(x, "MeasureValueType", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureAttributeMappings(value: MultiMeasureAttributeMappingList): Self = StObject.set(x, "MultiMeasureAttributeMappings", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureAttributeMappingsUndefined: Self = StObject.set(x, "MultiMeasureAttributeMappings", js.undefined)
    
    inline def setMultiMeasureAttributeMappingsVarargs(value: MultiMeasureAttributeMapping*): Self = StObject.set(x, "MultiMeasureAttributeMappings", js.Array(value*))
    
    inline def setSourceColumn(value: SchemaName): Self = StObject.set(x, "SourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceColumnUndefined: Self = StObject.set(x, "SourceColumn", js.undefined)
    
    inline def setTargetMeasureName(value: SchemaName): Self = StObject.set(x, "TargetMeasureName", value.asInstanceOf[js.Any])
    
    inline def setTargetMeasureNameUndefined: Self = StObject.set(x, "TargetMeasureName", js.undefined)
  }
}
