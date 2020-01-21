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
    CurrentRateInMegaBytesPerSecond: Int | scala.Double = null,
    DataTransferredInMegaBytes: Int | scala.Double = null,
    ElapsedTimeInSeconds: Int | scala.Double = null,
    EstimatedTimeToCompletionInSeconds: Int | scala.Double = null,
    Status: String = null,
    TotalDataInMegaBytes: Int | scala.Double = null
  ): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    if (CurrentRateInMegaBytesPerSecond != null) __obj.updateDynamic("CurrentRateInMegaBytesPerSecond")(CurrentRateInMegaBytesPerSecond.asInstanceOf[js.Any])
    if (DataTransferredInMegaBytes != null) __obj.updateDynamic("DataTransferredInMegaBytes")(DataTransferredInMegaBytes.asInstanceOf[js.Any])
    if (ElapsedTimeInSeconds != null) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.asInstanceOf[js.Any])
    if (EstimatedTimeToCompletionInSeconds != null) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TotalDataInMegaBytes != null) __obj.updateDynamic("TotalDataInMegaBytes")(TotalDataInMegaBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferProgress]
  }
}

