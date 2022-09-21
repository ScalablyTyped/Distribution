package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchProfileInitializationScript extends StObject {
  
  /**
    * An IAM role attached to a Studio Component that gives the studio component access to AWS resources at anytime while the instance is running. 
    */
  var runtimeRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The initialization script.
    */
  var script: js.UndefOr[StudioComponentInitializationScriptContent] = js.undefined
  
  /**
    * An IAM role attached to Studio Component when the system initialization script runs which give the studio component access to AWS resources when the system initialization script runs.
    */
  var secureInitializationRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The unique identifier for a studio component resource.
    */
  var studioComponentId: js.UndefOr[StudioComponentId] = js.undefined
  
  /**
    * The name for the studio component.
    */
  var studioComponentName: js.UndefOr[StudioComponentName] = js.undefined
}
object LaunchProfileInitializationScript {
  
  inline def apply(): LaunchProfileInitializationScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchProfileInitializationScript]
  }
  
  extension [Self <: LaunchProfileInitializationScript](x: Self) {
    
    inline def setRuntimeRoleArn(value: RoleArn): Self = StObject.set(x, "runtimeRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRoleArnUndefined: Self = StObject.set(x, "runtimeRoleArn", js.undefined)
    
    inline def setScript(value: StudioComponentInitializationScriptContent): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSecureInitializationRoleArn(value: RoleArn): Self = StObject.set(x, "secureInitializationRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecureInitializationRoleArnUndefined: Self = StObject.set(x, "secureInitializationRoleArn", js.undefined)
    
    inline def setStudioComponentId(value: StudioComponentId): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdUndefined: Self = StObject.set(x, "studioComponentId", js.undefined)
    
    inline def setStudioComponentName(value: StudioComponentName): Self = StObject.set(x, "studioComponentName", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentNameUndefined: Self = StObject.set(x, "studioComponentName", js.undefined)
  }
}
