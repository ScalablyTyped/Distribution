package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureValue extends StObject {
  
  /**
    *  Name of the MeasureValue.   For constraints on MeasureValue names, refer to  Naming Constraints in the Timestream developer guide.
    */
  var Name: SchemaName
  
  /**
    * Contains the data type of the MeasureValue for the time series data point.
    */
  var Type: MeasureValueType
  
  /**
    *  Value for the MeasureValue. 
    */
  var Value: StringValue2048
}
object MeasureValue {
  
  inline def apply(Name: SchemaName, Type: MeasureValueType, Value: StringValue2048): MeasureValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: MeasureValueType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringValue2048): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
