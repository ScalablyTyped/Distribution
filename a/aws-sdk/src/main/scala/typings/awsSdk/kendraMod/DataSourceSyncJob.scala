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
  def apply(
    DataSourceErrorCode: String = null,
    EndTime: Timestamp = null,
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    ExecutionId: String = null,
    StartTime: Timestamp = null,
    Status: DataSourceSyncJobStatus = null
  ): DataSourceSyncJob = {
    val __obj = js.Dynamic.literal()
    if (DataSourceErrorCode != null) __obj.updateDynamic("DataSourceErrorCode")(DataSourceErrorCode.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSyncJob]
  }
}

