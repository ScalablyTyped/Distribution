package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceRequest extends StObject {
  
  /**
    * The capacity provider strategy to update the service to use. If the service is using the default capacity provider strategy for the cluster, the service can be updated to use one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be updated to use the cluster's default capacity provider strategy. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created. 
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined
  
  /**
    * The number of instantiations of the task to place and keep running in your service.
    */
  var desiredCount: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to use a newer Docker image with the same image/tag combination (my_image:latest) or to roll Fargate tasks onto a newer platform version.
    */
  var forceNewDeployment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined
  
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * An array of task placement constraint objects to update the service to use. If no value is specified, the existing placement constraints for the service will remain unchanged. If this value is specified, it will override any existing placement constraints defined for the service. To remove all existing placement constraints, specify an empty array. You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  
  /**
    * The task placement strategy objects to update the service to use. If no value is specified, the existing placement strategy for the service will remain unchanged. If this value is specified, it will override the existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty object. You can specify a maximum of five strategy rules per service.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If a platform version is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service to update.
    */
  var service: String
  
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. If you modify the task definition with UpdateService, Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the new version is running.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
}
object UpdateServiceRequest {
  
  @scala.inline
  def apply(service: String): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceRequestMutableBuilder[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setDeploymentConfiguration(value: DeploymentConfiguration): Self = StObject.set(x, "deploymentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigurationUndefined: Self = StObject.set(x, "deploymentConfiguration", js.undefined)
    
    @scala.inline
    def setDesiredCount(value: BoxedInteger): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    @scala.inline
    def setForceNewDeployment(value: Boolean): Self = StObject.set(x, "forceNewDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceNewDeploymentUndefined: Self = StObject.set(x, "forceNewDeployment", js.undefined)
    
    @scala.inline
    def setHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = StObject.set(x, "healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckGracePeriodSecondsUndefined: Self = StObject.set(x, "healthCheckGracePeriodSeconds", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setPlacementConstraints(value: PlacementConstraints): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
    
    @scala.inline
    def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = StObject.set(x, "placementConstraints", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategy(value: PlacementStrategies): Self = StObject.set(x, "placementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
    
    @scala.inline
    def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = StObject.set(x, "placementStrategy", js.Array(value :_*))
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
  }
}
