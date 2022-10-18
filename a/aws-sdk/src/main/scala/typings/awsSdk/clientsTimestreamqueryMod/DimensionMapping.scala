package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionMapping extends StObject {
  
  /**
    * Type for the dimension. 
    */
  var DimensionValueType: typings.awsSdk.clientsTimestreamqueryMod.DimensionValueType
  
  /**
    * Column name from query result.
    */
  var Name: SchemaName
}
object DimensionMapping {
  
  inline def apply(DimensionValueType: DimensionValueType, Name: SchemaName): DimensionMapping = {
    val __obj = js.Dynamic.literal(DimensionValueType = DimensionValueType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionMapping]
  }
  
  extension [Self <: DimensionMapping](x: Self) {
    
    inline def setDimensionValueType(value: DimensionValueType): Self = StObject.set(x, "DimensionValueType", value.asInstanceOf[js.Any])
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
