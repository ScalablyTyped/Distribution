package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The related time series that you are modifying. This value is case insensitive.
    */
  var AttributeName: Name
  
  /**
    * The operation that is applied to the provided attribute. Operations include:    ADD - adds Value to all rows of AttributeName.    SUBTRACT - subtracts Value from all rows of AttributeName.    MULTIPLY - multiplies all rows of AttributeName by Value.    DIVIDE - divides all rows of AttributeName by Value.  
    */
  var Operation: typings.awsSdk.forecastserviceMod.Operation
  
  /**
    * The value that is applied for the chosen Operation.
    */
  var Value: Double
}
object Action {
  
  inline def apply(AttributeName: Name, Operation: Operation, Value: Double): Action = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
