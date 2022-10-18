package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiMeasureMappings extends StObject {
  
  /**
    * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
    */
  var MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList
  
  /**
    * The name of the target multi-measure name in the derived table. This input is required when measureNameColumn is not provided. If MeasureNameColumn is provided, then value from that column will be used as multi-measure name.
    */
  var TargetMultiMeasureName: js.UndefOr[SchemaName] = js.undefined
}
object MultiMeasureMappings {
  
  inline def apply(MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList): MultiMeasureMappings = {
    val __obj = js.Dynamic.literal(MultiMeasureAttributeMappings = MultiMeasureAttributeMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiMeasureMappings]
  }
  
  extension [Self <: MultiMeasureMappings](x: Self) {
    
    inline def setMultiMeasureAttributeMappings(value: MultiMeasureAttributeMappingList): Self = StObject.set(x, "MultiMeasureAttributeMappings", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureAttributeMappingsVarargs(value: MultiMeasureAttributeMapping*): Self = StObject.set(x, "MultiMeasureAttributeMappings", js.Array(value*))
    
    inline def setTargetMultiMeasureName(value: SchemaName): Self = StObject.set(x, "TargetMultiMeasureName", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureNameUndefined: Self = StObject.set(x, "TargetMultiMeasureName", js.undefined)
  }
}
