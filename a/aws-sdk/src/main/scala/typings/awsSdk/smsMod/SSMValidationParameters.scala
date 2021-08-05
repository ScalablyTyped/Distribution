package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSMValidationParameters extends StObject {
  
  /**
    * The command to run the validation script
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * The timeout interval, in seconds.
    */
  var executionTimeoutSeconds: js.UndefOr[ExecutionTimeoutSeconds] = js.undefined
  
  /**
    * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
    */
  var instanceId: js.UndefOr[InstanceId] = js.undefined
  
  /**
    * The name of the S3 bucket for output.
    */
  var outputS3BucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The type of validation script.
    */
  var scriptType: js.UndefOr[ScriptType] = js.undefined
  
  /**
    * The location of the validation script.
    */
  var source: js.UndefOr[Source] = js.undefined
}
object SSMValidationParameters {
  
  inline def apply(): SSMValidationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSMValidationParameters]
  }
  
  extension [Self <: SSMValidationParameters](x: Self) {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setExecutionTimeoutSeconds(value: ExecutionTimeoutSeconds): Self = StObject.set(x, "executionTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutSecondsUndefined: Self = StObject.set(x, "executionTimeoutSeconds", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setOutputS3BucketName(value: BucketName): Self = StObject.set(x, "outputS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketNameUndefined: Self = StObject.set(x, "outputS3BucketName", js.undefined)
    
    inline def setScriptType(value: ScriptType): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    inline def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
