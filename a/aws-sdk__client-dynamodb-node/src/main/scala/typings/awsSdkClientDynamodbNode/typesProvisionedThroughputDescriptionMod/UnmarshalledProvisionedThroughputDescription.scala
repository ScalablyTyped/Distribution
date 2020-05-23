package typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledProvisionedThroughputDescription extends ProvisionedThroughputDescription {
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  @JSName("LastDecreaseDateTime")
  var LastDecreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  @JSName("LastIncreaseDateTime")
  var LastIncreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.undefined
}

object UnmarshalledProvisionedThroughputDescription {
  @scala.inline
  def apply(
    LastDecreaseDateTime: Date = null,
    LastIncreaseDateTime: Date = null,
    NumberOfDecreasesToday: js.UndefOr[Double] = js.undefined,
    ReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    WriteCapacityUnits: js.UndefOr[Double] = js.undefined
  ): UnmarshalledProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime.asInstanceOf[js.Any])
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfDecreasesToday)) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WriteCapacityUnits)) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
  }
}

