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
  @scala.inline
  implicit class UpdateDimensionRequestOps[Self <: UpdateDimensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: DimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = this.set("stringValues", js.Array(value :_*))
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = this.set("stringValues", value.asInstanceOf[js.Any])
  }
  
}

