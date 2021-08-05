package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentConfigInput extends StObject {
  
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * The name of the deployment configuration to create.
    */
  var deploymentConfigName: DeploymentConfigName
  
  /**
    * The minimum number of healthy instances that should be available at any time during the deployment. There are two parameters expected in the input: type and value. The type parameter takes either of the following values:   HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.   FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of instances and rounds up fractional instances.   The value parameter takes an integer. For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
  
  /**
    * The configuration that specifies how the deployment traffic is routed.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
}
object CreateDeploymentConfigInput {
  
  inline def apply(deploymentConfigName: DeploymentConfigName): CreateDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentConfigInput]
  }
  
  extension [Self <: CreateDeploymentConfigInput](x: Self) {
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    inline def setMinimumHealthyHosts(value: MinimumHealthyHosts): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
    
    inline def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
    
    inline def setTrafficRoutingConfig(value: TrafficRoutingConfig): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
  }
}
