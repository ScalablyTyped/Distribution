package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDimensionRequest extends StObject {
  
  /**
    * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to remember what it does.
    */
  var name: DimensionName
  
  /**
    * Specifies the value or list of values for the dimension. For TOPIC_FILTER dimensions, this is a pattern used to match the MQTT topic (for example, "admin/#").
    */
  var stringValues: DimensionStringValues
}
object UpdateDimensionRequest {
  
  @scala.inline
  def apply(name: DimensionName, stringValues: DimensionStringValues): UpdateDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stringValues = stringValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDimensionRequest]
  }
  
  @scala.inline
  implicit class UpdateDimensionRequestMutableBuilder[Self <: UpdateDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
  }
}
