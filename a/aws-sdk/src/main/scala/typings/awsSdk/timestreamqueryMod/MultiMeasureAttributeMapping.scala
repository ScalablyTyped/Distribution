package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiMeasureAttributeMapping extends StObject {
  
  /**
    * Type of the attribute to be read from the source column.
    */
  var MeasureValueType: ScalarMeasureValueType
  
  /**
    * Source column from where the attribute value is to be read.
    */
  var SourceColumn: SchemaName
  
  /**
    * Custom name to be used for attribute name in derived table. If not provided, source column name would be used.
    */
  var TargetMultiMeasureAttributeName: js.UndefOr[SchemaName] = js.undefined
}
object MultiMeasureAttributeMapping {
  
  inline def apply(MeasureValueType: ScalarMeasureValueType, SourceColumn: SchemaName): MultiMeasureAttributeMapping = {
    val __obj = js.Dynamic.literal(MeasureValueType = MeasureValueType.asInstanceOf[js.Any], SourceColumn = SourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiMeasureAttributeMapping]
  }
  
  extension [Self <: MultiMeasureAttributeMapping](x: Self) {
    
    inline def setMeasureValueType(value: ScalarMeasureValueType): Self = StObject.set(x, "MeasureValueType", value.asInstanceOf[js.Any])
    
    inline def setSourceColumn(value: SchemaName): Self = StObject.set(x, "SourceColumn", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureAttributeName(value: SchemaName): Self = StObject.set(x, "TargetMultiMeasureAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiMeasureAttributeNameUndefined: Self = StObject.set(x, "TargetMultiMeasureAttributeName", js.undefined)
  }
}
