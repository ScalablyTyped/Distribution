package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiMeasureMappings extends StObject {
  
  /**
    * 
    */
  var MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList
  
  /**
    * 
    */
  var TargetMultiMeasureName: js.UndefOr[SchemaName] = js.undefined
}
object MultiMeasureMappings {
  
  inline def apply(MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList): MultiMeasureMappings = {
    val __obj = js.Dynamic.literal(MultiMeasureAttributeMappings = MultiMeasureAttributeMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiMeasureMappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiMeasureMappings] (val x: Self) extends AnyVal {
    
    inline def setMultiMeasureAttributeMappings(value: MultiMeasureAttributeMappingList): Self = StObject.set(x, "MultiMeasureAttributeMappings", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureAttributeMappingsVarargs(value: MultiMeasureAttributeMapping*): Self = StObject.set(x, "MultiMeasureAttributeMappings", js.Array(value*))
    
    inline def setTargetMultiMeasureName(value: SchemaName): Self = StObject.set(x, "TargetMultiMeasureName", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureNameUndefined: Self = StObject.set(x, "TargetMultiMeasureName", js.undefined)
  }
}
