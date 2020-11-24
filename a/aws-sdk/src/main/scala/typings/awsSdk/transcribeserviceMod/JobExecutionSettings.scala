package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): JobExecutionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSettings]
  }
  
  @scala.inline
  implicit class JobExecutionSettingsOps[Self <: JobExecutionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowDeferredExecution(value: Boolean): Self = this.set("AllowDeferredExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeferredExecution: Self = this.set("AllowDeferredExecution", js.undefined)
    
    @scala.inline
    def setDataAccessRoleArn(value: DataAccessRoleArn): Self = this.set("DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAccessRoleArn: Self = this.set("DataAccessRoleArn", js.undefined)
  }
}
