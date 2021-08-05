package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetError extends StObject {
  
  /**
    * The error code that indicates why the instance could not be launched. For more information about error codes, see Error Codes.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message that describes why the instance could not be launched. For more information about error messages, see Error Codes.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined
  
  /**
    * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined
}
object CreateFleetError {
  
  inline def apply(): CreateFleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetError]
  }
  
  extension [Self <: CreateFleetError](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLaunchTemplateAndOverrides(value: LaunchTemplateAndOverridesResponse): Self = StObject.set(x, "LaunchTemplateAndOverrides", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateAndOverridesUndefined: Self = StObject.set(x, "LaunchTemplateAndOverrides", js.undefined)
    
    inline def setLifecycle(value: InstanceLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
