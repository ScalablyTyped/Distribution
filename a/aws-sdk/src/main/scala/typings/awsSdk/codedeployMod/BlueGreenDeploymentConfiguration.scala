package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenDeploymentConfiguration extends StObject {
  
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment.
    */
  var deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined
  
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
    */
  var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined
  
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment.
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined
}
object BlueGreenDeploymentConfiguration {
  
  inline def apply(): BlueGreenDeploymentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenDeploymentConfiguration]
  }
  
  extension [Self <: BlueGreenDeploymentConfiguration](x: Self) {
    
    inline def setDeploymentReadyOption(value: DeploymentReadyOption): Self = StObject.set(x, "deploymentReadyOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentReadyOptionUndefined: Self = StObject.set(x, "deploymentReadyOption", js.undefined)
    
    inline def setGreenFleetProvisioningOption(value: GreenFleetProvisioningOption): Self = StObject.set(x, "greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    
    inline def setGreenFleetProvisioningOptionUndefined: Self = StObject.set(x, "greenFleetProvisioningOption", js.undefined)
    
    inline def setTerminateBlueInstancesOnDeploymentSuccess(value: BlueInstanceTerminationOption): Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    
    inline def setTerminateBlueInstancesOnDeploymentSuccessUndefined: Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
}
