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
  def apply(): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransferProgress]
  }
  @scala.inline
  implicit class DataTransferProgressOps[Self <: DataTransferProgress] (val x: Self) extends AnyVal {
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
    def setCurrentRateInMegaBytesPerSecond(value: DoubleOptional): Self = this.set("CurrentRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRateInMegaBytesPerSecond: Self = this.set("CurrentRateInMegaBytesPerSecond", js.undefined)
    @scala.inline
    def setDataTransferredInMegaBytes(value: Long): Self = this.set("DataTransferredInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferredInMegaBytes: Self = this.set("DataTransferredInMegaBytes", js.undefined)
    @scala.inline
    def setElapsedTimeInSeconds(value: LongOptional): Self = this.set("ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsedTimeInSeconds: Self = this.set("ElapsedTimeInSeconds", js.undefined)
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = this.set("EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTimeToCompletionInSeconds: Self = this.set("EstimatedTimeToCompletionInSeconds", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTotalDataInMegaBytes(value: Long): Self = this.set("TotalDataInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDataInMegaBytes: Self = this.set("TotalDataInMegaBytes", js.undefined)
  }
  
}

