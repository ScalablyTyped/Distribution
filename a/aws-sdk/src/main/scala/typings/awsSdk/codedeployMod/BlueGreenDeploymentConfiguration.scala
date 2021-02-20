package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlueGreenDeploymentConfiguration extends StObject {
  
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment.
    */
  var deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.native
  
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
    */
  var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.native
  
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment.
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.native
}
object BlueGreenDeploymentConfiguration {
  
  @scala.inline
  def apply(): BlueGreenDeploymentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenDeploymentConfiguration]
  }
  
  @scala.inline
  implicit class BlueGreenDeploymentConfigurationMutableBuilder[Self <: BlueGreenDeploymentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentReadyOption(value: DeploymentReadyOption): Self = StObject.set(x, "deploymentReadyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentReadyOptionUndefined: Self = StObject.set(x, "deploymentReadyOption", js.undefined)
    
    @scala.inline
    def setGreenFleetProvisioningOption(value: GreenFleetProvisioningOption): Self = StObject.set(x, "greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenFleetProvisioningOptionUndefined: Self = StObject.set(x, "greenFleetProvisioningOption", js.undefined)
    
    @scala.inline
    def setTerminateBlueInstancesOnDeploymentSuccess(value: BlueInstanceTerminationOption): Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateBlueInstancesOnDeploymentSuccessUndefined: Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
}
