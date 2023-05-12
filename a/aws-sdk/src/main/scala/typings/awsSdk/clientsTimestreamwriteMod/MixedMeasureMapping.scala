package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedMeasureMapping extends StObject {
  
  /**
    * 
    */
  var MeasureName: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * 
    */
  var MeasureValueType: typings.awsSdk.clientsTimestreamwriteMod.MeasureValueType
  
  /**
    * 
    */
  var MultiMeasureAttributeMappings: js.UndefOr[MultiMeasureAttributeMappingList] = js.undefined
  
  /**
    * 
    */
  var SourceColumn: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * 
    */
  var TargetMeasureName: js.UndefOr[SchemaName] = js.undefined
}
object MixedMeasureMapping {
  
  inline def apply(MeasureValueType: MeasureValueType): MixedMeasureMapping = {
    val __obj = js.Dynamic.literal(MeasureValueType = MeasureValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedMeasureMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixedMeasureMapping] (val x: Self) extends AnyVal {
    
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
