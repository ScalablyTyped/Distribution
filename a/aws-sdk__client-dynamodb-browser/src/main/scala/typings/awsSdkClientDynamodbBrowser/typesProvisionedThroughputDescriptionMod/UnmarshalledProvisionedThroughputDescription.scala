package typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod

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
    NumberOfDecreasesToday: Int | Double = null,
    ReadCapacityUnits: Int | Double = null,
    WriteCapacityUnits: Int | Double = null
  ): UnmarshalledProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime.asInstanceOf[js.Any])
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime.asInstanceOf[js.Any])
    if (NumberOfDecreasesToday != null) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.asInstanceOf[js.Any])
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
  }
}

