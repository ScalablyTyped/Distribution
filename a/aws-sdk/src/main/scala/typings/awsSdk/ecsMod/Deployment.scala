package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
  /**
    * The capacity provider strategy that the deployment is using.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  
  /**
    * The Unix timestamp for when the service deployment was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the deployment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The launch type the tasks in the service are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  
  /**
    * The number of tasks in the deployment that are in the PENDING status.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  
  /**
    * The status of the deployment. The following describes each state:  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  
  /**
    * The Unix timestamp for when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDesiredCount(value: Integer): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
