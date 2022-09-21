package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentComponentUpdatePolicy extends StObject {
  
  /**
    * Whether or not to notify components and wait for components to become safe to update. Choose from the following options:    NOTIFY_COMPONENTS – The deployment notifies each component before it stops and updates that component. Components can use the SubscribeToComponentUpdates IPC operation to receive these notifications. Then, components can respond with the DeferComponentUpdate IPC operation. For more information, see Create deployments in the IoT Greengrass V2 Developer Guide.    SKIP_NOTIFY_COMPONENTS – The deployment doesn't notify components or wait for them to be safe to update.   Default: NOTIFY_COMPONENTS 
    */
  var action: js.UndefOr[DeploymentComponentUpdatePolicyAction] = js.undefined
  
  /**
    * The amount of time in seconds that each component on a device has to report that it's safe to update. If the component waits for longer than this timeout, then the deployment proceeds on the device. Default: 60 
    */
  var timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
}
object DeploymentComponentUpdatePolicy {
  
  inline def apply(): DeploymentComponentUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentComponentUpdatePolicy]
  }
  
  extension [Self <: DeploymentComponentUpdatePolicy](x: Self) {
    
    inline def setAction(value: DeploymentComponentUpdatePolicyAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setTimeoutInSeconds(value: OptionalInteger): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
