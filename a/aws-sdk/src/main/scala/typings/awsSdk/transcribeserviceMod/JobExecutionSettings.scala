package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSettings extends js.Object {
  /**
    * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded. When the AllowDeferredExecution field is true, jobs are queued and executed when the number of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a LimitExceededException exception. If you specify the AllowDeferredExecution field, you must specify the DataAccessRoleArn field.
    */
  var AllowDeferredExecution: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon Transcribe assumes this role to read queued media files. If you have specified an output S3 bucket for the transcription results, this role should have access to the output bucket as well. If you specify the AllowDeferredExecution field, you must specify the DataAccessRoleArn field.
    */
  var DataAccessRoleArn: js.UndefOr[typings.awsSdk.transcribeserviceMod.DataAccessRoleArn] = js.native
}

object JobExecutionSettings {
  @scala.inline
  def apply(
    AllowDeferredExecution: js.UndefOr[scala.Boolean] = js.undefined,
    DataAccessRoleArn: DataAccessRoleArn = null
  ): JobExecutionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowDeferredExecution)) __obj.updateDynamic("AllowDeferredExecution")(AllowDeferredExecution.asInstanceOf[js.Any])
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSettings]
  }
}

