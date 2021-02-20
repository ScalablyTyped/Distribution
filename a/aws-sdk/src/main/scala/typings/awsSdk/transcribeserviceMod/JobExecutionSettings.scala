package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionSettings extends StObject {
  
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
  implicit class JobExecutionSettingsMutableBuilder[Self <: JobExecutionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDeferredExecution(value: Boolean): Self = StObject.set(x, "AllowDeferredExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeferredExecutionUndefined: Self = StObject.set(x, "AllowDeferredExecution", js.undefined)
    
    @scala.inline
    def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
  }
}
