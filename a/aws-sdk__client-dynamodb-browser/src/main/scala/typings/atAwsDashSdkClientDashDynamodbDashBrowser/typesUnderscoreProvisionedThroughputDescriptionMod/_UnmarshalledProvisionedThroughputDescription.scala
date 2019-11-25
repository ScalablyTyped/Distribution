package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledProvisionedThroughputDescription extends _ProvisionedThroughputDescription {
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  @JSName("LastDecreaseDateTime")
  var LastDecreaseDateTime__UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  @JSName("LastIncreaseDateTime")
  var LastIncreaseDateTime__UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledProvisionedThroughputDescription {
  @scala.inline
  def apply(
    LastDecreaseDateTime: Date = null,
    LastIncreaseDateTime: Date = null,
    NumberOfDecreasesToday: Int | Double = null,
    ReadCapacityUnits: Int | Double = null,
    WriteCapacityUnits: Int | Double = null
  ): _UnmarshalledProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime.asInstanceOf[js.Any])
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime.asInstanceOf[js.Any])
    if (NumberOfDecreasesToday != null) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.asInstanceOf[js.Any])
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledProvisionedThroughputDescription]
  }
}

