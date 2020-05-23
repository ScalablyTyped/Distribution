package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferProgress extends js.Object {
  /**
    * Describes the data transfer rate in MB's per second.
    */
  var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  /**
    * Describes the total amount of data that has been transfered in MB's.
    */
  var DataTransferredInMegaBytes: js.UndefOr[Long] = js.native
  /**
    * Describes the number of seconds that have elapsed during the data transfer.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * Describes the estimated number of seconds remaining to complete the transfer.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Describes the total amount of data to be transfered in megabytes.
    */
  var TotalDataInMegaBytes: js.UndefOr[Long] = js.native
}

object DataTransferProgress {
  @scala.inline
  def apply(
    CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
    DataTransferredInMegaBytes: js.UndefOr[Long] = js.undefined,
    ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
    EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
    Status: String = null,
    TotalDataInMegaBytes: js.UndefOr[Long] = js.undefined
  ): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentRateInMegaBytesPerSecond)) __obj.updateDynamic("CurrentRateInMegaBytesPerSecond")(CurrentRateInMegaBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DataTransferredInMegaBytes)) __obj.updateDynamic("DataTransferredInMegaBytes")(DataTransferredInMegaBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ElapsedTimeInSeconds)) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EstimatedTimeToCompletionInSeconds)) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalDataInMegaBytes)) __obj.updateDynamic("TotalDataInMegaBytes")(TotalDataInMegaBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferProgress]
  }
}

