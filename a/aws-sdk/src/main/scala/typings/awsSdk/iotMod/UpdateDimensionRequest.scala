package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDimensionRequest extends js.Object {
  /**
    * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to remember what it does.
    */
  var name: DimensionName = js.native
  /**
    * Specifies the value or list of values for the dimension. For TOPIC_FILTER dimensions, this is a pattern used to match the MQTT topic (for example, "admin/#").
    */
  var stringValues: DimensionStringValues = js.native
}

object UpdateDimensionRequest {
  @scala.inline
  def apply(name: DimensionName, stringValues: DimensionStringValues): UpdateDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stringValues = stringValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDimensionRequest]
  }
}

