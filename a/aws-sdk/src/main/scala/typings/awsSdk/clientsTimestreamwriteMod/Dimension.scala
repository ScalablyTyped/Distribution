package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * The data type of the dimension for the time series data point.
    */
  var DimensionValueType: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DimensionValueType] = js.undefined
  
  /**
    *  Dimension represents the meta data attributes of the time series. For example, the name and availability zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.  For constraints on Dimension names, see Naming Constraints.
    */
  var Name: SchemaName
  
  /**
    * The value of the dimension.
    */
  var Value: SchemaValue
}
object Dimension {
  
  inline def apply(Name: SchemaName, Value: SchemaValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setDimensionValueType(value: DimensionValueType): Self = StObject.set(x, "DimensionValueType", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueTypeUndefined: Self = StObject.set(x, "DimensionValueType", js.undefined)
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SchemaValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
