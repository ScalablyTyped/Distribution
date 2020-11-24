package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSMValidationParameters extends js.Object {
  
  /**
    * The command to run the validation script
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * The timeout interval, in seconds.
    */
  var executionTimeoutSeconds: js.UndefOr[ExecutionTimeoutSeconds] = js.native
  
  /**
    * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
    */
  var instanceId: js.UndefOr[InstanceId] = js.native
  
  /**
    * The name of the S3 bucket for output.
    */
  var outputS3BucketName: js.UndefOr[BucketName] = js.native
  
  /**
    * The type of validation script.
    */
  var scriptType: js.UndefOr[ScriptType] = js.native
  
  /**
    * The location of the validation script.
    */
  var source: js.UndefOr[Source] = js.native
}
object SSMValidationParameters {
  
  @scala.inline
  def apply(): SSMValidationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSMValidationParameters]
  }
  
  @scala.inline
  implicit class SSMValidationParametersOps[Self <: SSMValidationParameters] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: Command): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setExecutionTimeoutSeconds(value: ExecutionTimeoutSeconds): Self = this.set("executionTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTimeoutSeconds: Self = this.set("executionTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setOutputS3BucketName(value: BucketName): Self = this.set("outputS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3BucketName: Self = this.set("outputS3BucketName", js.undefined)
    
    @scala.inline
    def setScriptType(value: ScriptType): Self = this.set("scriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptType: Self = this.set("scriptType", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
