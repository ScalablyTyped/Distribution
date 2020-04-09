package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionResponse extends js.Object {
  /**
    * The ARN (Amazon resource name) for the dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.native
  /**
    * The date the dimension was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date the dimension was last modified.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.native
  /**
    * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used to match the MQTT topic name.
    */
  var stringValues: js.UndefOr[DimensionStringValues] = js.native
  /**
    * The type of the dimension.
    */
  var `type`: js.UndefOr[DimensionType] = js.native
}

object DescribeDimensionResponse {
  @scala.inline
  def apply(
    arn: DimensionArn = null,
    creationDate: Timestamp = null,
    lastModifiedDate: Timestamp = null,
    name: DimensionName = null,
    stringValues: DimensionStringValues = null,
    `type`: DimensionType = null
  ): DescribeDimensionResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValues != null) __obj.updateDynamic("stringValues")(stringValues.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionResponse]
  }
}

