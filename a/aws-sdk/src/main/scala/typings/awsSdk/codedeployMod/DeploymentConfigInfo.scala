package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentConfigInfo extends StObject {
  
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  
  /**
    * The time at which the deployment configuration was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
  
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  
  /**
    * Information about the number or percentage of minimum healthy instance.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.native
  
  /**
    * The configuration that specifies how the deployment traffic is routed. Used for deployments with a Lambda or ECS compute platform only.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.native
}
object DeploymentConfigInfo {
  
  @scala.inline
  def apply(): DeploymentConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigInfo]
  }
  
  @scala.inline
  implicit class DeploymentConfigInfoMutableBuilder[Self <: DeploymentConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeploymentConfigId(value: DeploymentConfigId): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    @scala.inline
    def setMinimumHealthyHosts(value: MinimumHealthyHosts): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
    
    @scala.inline
    def setTrafficRoutingConfig(value: TrafficRoutingConfig): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
  }
}
