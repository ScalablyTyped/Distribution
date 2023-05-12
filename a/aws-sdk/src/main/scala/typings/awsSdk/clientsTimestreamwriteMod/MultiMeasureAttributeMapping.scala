package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiMeasureAttributeMapping extends StObject {
  
  /**
    * 
    */
  var MeasureValueType: js.UndefOr[ScalarMeasureValueType] = js.undefined
  
  /**
    * 
    */
  var SourceColumn: SchemaName
  
  /**
    * 
    */
  var TargetMultiMeasureAttributeName: js.UndefOr[SchemaName] = js.undefined
}
object MultiMeasureAttributeMapping {
  
  inline def apply(SourceColumn: SchemaName): MultiMeasureAttributeMapping = {
    val __obj = js.Dynamic.literal(SourceColumn = SourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiMeasureAttributeMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiMeasureAttributeMapping] (val x: Self) extends AnyVal {
    
    inline def setMeasureValueType(value: ScalarMeasureValueType): Self = StObject.set(x, "MeasureValueType", value.asInstanceOf[js.Any])
    
    inline def setMeasureValueTypeUndefined: Self = StObject.set(x, "MeasureValueType", js.undefined)
    
    inline def setSourceColumn(value: SchemaName): Self = StObject.set(x, "SourceColumn", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureAttributeName(value: SchemaName): Self = StObject.set(x, "TargetMultiMeasureAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureAttributeNameUndefined: Self = StObject.set(x, "TargetMultiMeasureAttributeName", js.undefined)
  }
}
