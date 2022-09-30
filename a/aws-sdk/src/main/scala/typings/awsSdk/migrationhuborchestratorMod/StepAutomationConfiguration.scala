package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepAutomationConfiguration extends StObject {
  
  /**
    * The command to run the script.
    */
  var command: js.UndefOr[PlatformCommand] = js.undefined
  
  /**
    * The source or target environment.
    */
  var runEnvironment: js.UndefOr[RunEnvironment] = js.undefined
  
  /**
    * The Amazon S3 bucket where the script is located.
    */
  var scriptLocationS3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 key for the script location.
    */
  var scriptLocationS3Key: js.UndefOr[PlatformScriptKey] = js.undefined
  
  /**
    * The servers on which to run the script.
    */
  var targetType: js.UndefOr[TargetType] = js.undefined
}
object StepAutomationConfiguration {
  
  inline def apply(): StepAutomationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepAutomationConfiguration]
  }
  
  extension [Self <: StepAutomationConfiguration](x: Self) {
    
    inline def setCommand(value: PlatformCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setRunEnvironment(value: RunEnvironment): Self = StObject.set(x, "runEnvironment", value.asInstanceOf[js.Any])
    
    inline def setRunEnvironmentUndefined: Self = StObject.set(x, "runEnvironment", js.undefined)
    
    inline def setScriptLocationS3Bucket(value: String): Self = StObject.set(x, "scriptLocationS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setScriptLocationS3BucketUndefined: Self = StObject.set(x, "scriptLocationS3Bucket", js.undefined)
    
    inline def setScriptLocationS3Key(value: PlatformScriptKey): Self = StObject.set(x, "scriptLocationS3Key", value.asInstanceOf[js.Any])
    
    inline def setScriptLocationS3KeyUndefined: Self = StObject.set(x, "scriptLocationS3Key", js.undefined)
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}
