package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSyncJob extends js.Object {
  /**
    * If the reason that the synchronization failed is due to an error with the underlying data source, this field contains a code that identifies the error.
    */
  var DataSourceErrorCode: js.UndefOr[String] = js.native
  /**
    * The UNIX datetime that the synchronization job was completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * If the Status field is set to FAILED, the ErrorCode field contains a the reason that the synchronization failed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kendraMod.ErrorCode] = js.native
  /**
    * If the Status field is set to ERROR, the ErrorMessage field contains a description of the error that caused the synchronization to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * A unique identifier for the synchronization job.
    */
  var ExecutionId: js.UndefOr[String] = js.native
  /**
    * Maps a batch delete document request to a specific data source sync job. This is optional and should only be supplied when documents are deleted by a connector.
    */
  var Metrics: js.UndefOr[DataSourceSyncJobMetrics] = js.native
  /**
    * The UNIX datetime that the synchronization job was started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The execution status of the synchronization job. When the Status field is set to SUCCEEDED, the synchronization job is done. If the status code is set to FAILED, the ErrorCode and ErrorMessage fields give you the reason for the failure.
    */
  var Status: js.UndefOr[DataSourceSyncJobStatus] = js.native
}

object DataSourceSyncJob {
  @scala.inline
  def apply(): DataSourceSyncJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSyncJob]
  }
  @scala.inline
  implicit class DataSourceSyncJobOps[Self <: DataSourceSyncJob] (val x: Self) extends AnyVal {
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
    def setDataSourceErrorCode(value: String): Self = this.set("DataSourceErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceErrorCode: Self = this.set("DataSourceErrorCode", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setExecutionId(value: String): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("ExecutionId", js.undefined)
    @scala.inline
    def setMetrics(value: DataSourceSyncJobMetrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: DataSourceSyncJobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

