package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDimensionRequest extends js.Object {
  /**
    * Each dimension must have a unique client request token. If you try to create a new dimension with the same token as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to remember what it does.
    */
  var name: DimensionName = js.native
  /**
    * Specifies the value or list of values for the dimension. For TOPIC_FILTER dimensions, this is a pattern used to match the MQTT topic (for example, "admin/#").
    */
  var stringValues: DimensionStringValues = js.native
  /**
    * Metadata that can be used to manage the dimension.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies the type of dimension. Supported types: TOPIC_FILTER. 
    */
  var `type`: DimensionType = js.native
}

object CreateDimensionRequest {
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    name: DimensionName,
    stringValues: DimensionStringValues,
    `type`: DimensionType
  ): CreateDimensionRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stringValues = stringValues.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDimensionRequest]
  }
  @scala.inline
  implicit class CreateDimensionRequestOps[Self <: CreateDimensionRequest] (val x: Self) extends AnyVal {
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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = this.set("stringValues", js.Array(value :_*))
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = this.set("stringValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DimensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

