package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The capacity provider strategy that the deployment is using.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The Unix timestamp for when the service deployment was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type the tasks in the service are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The number of tasks in the deployment that are in the PENDING status.
    */
  var pendingCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the deployment. The following describes each state:  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.undefined
}
object Deployment {
  
  inline def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  extension [Self <: Deployment](x: Self) {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDesiredCount(value: Integer): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    inline def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    inline def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    inline def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
