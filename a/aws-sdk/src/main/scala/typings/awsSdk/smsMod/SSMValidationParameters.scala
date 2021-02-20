package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSMValidationParameters extends StObject {
  
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
  implicit class SSMValidationParametersMutableBuilder[Self <: SSMValidationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setExecutionTimeoutSeconds(value: ExecutionTimeoutSeconds): Self = StObject.set(x, "executionTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeoutSecondsUndefined: Self = StObject.set(x, "executionTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setOutputS3BucketName(value: BucketName): Self = StObject.set(x, "outputS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3BucketNameUndefined: Self = StObject.set(x, "outputS3BucketName", js.undefined)
    
    @scala.inline
    def setScriptType(value: ScriptType): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
