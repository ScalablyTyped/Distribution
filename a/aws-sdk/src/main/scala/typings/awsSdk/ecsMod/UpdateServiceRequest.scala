package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceRequest extends StObject {
  
  /**
    * The capacity provider strategy to update the service to use. if the service uses the default capacity provider strategy for the cluster, the service can be updated to use one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is using a capacity provider strategy that's not the default capacity provider strategy, the service can't be updated to use the cluster's default capacity provider strategy. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created. 
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your service runs on. If you do not specify a cluster, the default cluster is assumed.
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
    * Determines whether to turn on Amazon ECS managed tags for the tasks in the service. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide. Only tasks launched after the update will reflect the update. To update the tags on all tasks, set forceNewDeployment to true, so that Amazon ECS starts new tasks with the updated tags.
    */
  var enableECSManagedTags: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If true, this enables execute command functionality on all task containers. If you do not want to override the value that was set when the service was created, you can set this to null when performing this action.
    */
  var enableExecuteCommand: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Determines whether to force a new deployment of the service. By default, deployments aren't forced. You can use this option to start a new deployment with no service definition changes. For example, you can update a service's tasks to use a newer Docker image with the same image/tag combination (my_image:latest) or to roll Fargate tasks onto a newer platform version.
    */
  var forceNewDeployment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * A list of Elastic Load Balancing load balancer objects. It contains the load balancer name, the container name, and the container port to access from the load balancer. The container name is as it appears in a container definition. When you add, update, or remove a load balancer configuration, Amazon ECS starts new tasks with the updated Elastic Load Balancing configuration, and then stops the old tasks when the new tasks are running. For services that use rolling updates, you can add, update, or remove Elastic Load Balancing target groups. You can update from a single target group to multiple target groups and from multiple target groups to a single target group. For services that use blue/green deployments, you can update Elastic Load Balancing target groups by using  CreateDeployment  through CodeDeploy. Note that multiple target groups are not supported for blue/green deployments. For more information see Register multiple target groups with a service in the Amazon Elastic Container Service Developer Guide.  For services that use the external deployment controller, you can add, update, or remove load balancers by using CreateTaskSet. Note that multiple target groups are not supported for external deployments. For more information see Register multiple target groups with a service in the Amazon Elastic Container Service Developer Guide.  You can remove existing loadBalancers by passing an empty list.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  
  /**
    * An object representing the network configuration for the service.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * An array of task placement constraint objects to update the service to use. If no value is specified, the existing placement constraints for the service will remain unchanged. If this value is specified, it will override any existing placement constraints defined for the service. To remove all existing placement constraints, specify an empty array. You can specify a maximum of 10 constraints for each task. This limit includes constraints in the task definition and those specified at runtime.
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  
  /**
    * The task placement strategy objects to update the service to use. If no value is specified, the existing placement strategy for the service will remain unchanged. If this value is specified, it will override the existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty object. You can specify a maximum of five strategy rules for each service.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  
  /**
    * The platform version that your tasks in the service run on. A platform version is only specified for tasks using the Fargate launch type. If a platform version is not specified, the LATEST platform version is used. For more information, see Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags aren't propagated. Only tasks launched after the update will reflect the update. To update the tags on all tasks, set forceNewDeployment to true, so that Amazon ECS starts new tasks with the updated tags.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.undefined
  
  /**
    * The name of the service to update.
    */
  var service: String
  
  /**
    * The details for the service discovery registries to assign to this service. For more information, see Service Discovery. When you add, update, or remove the service registries configuration, Amazon ECS starts new tasks with the updated service registries configuration, and then stops the old tasks when the new tasks are running. You can remove existing serviceRegistries by passing an empty list.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. If you modify the task definition with UpdateService, Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the new version is running.
    */
  var taskDefinition: js.UndefOr[String] = js.undefined
}
object UpdateServiceRequest {
  
  inline def apply(service: String): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  
  extension [Self <: UpdateServiceRequest](x: Self) {
    
    inline def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setDeploymentConfiguration(value: DeploymentConfiguration): Self = StObject.set(x, "deploymentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigurationUndefined: Self = StObject.set(x, "deploymentConfiguration", js.undefined)
    
    inline def setDesiredCount(value: BoxedInteger): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    inline def setEnableECSManagedTags(value: BoxedBoolean): Self = StObject.set(x, "enableECSManagedTags", value.asInstanceOf[js.Any])
    
    inline def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "enableECSManagedTags", js.undefined)
    
    inline def setEnableExecuteCommand(value: BoxedBoolean): Self = StObject.set(x, "enableExecuteCommand", value.asInstanceOf[js.Any])
    
    inline def setEnableExecuteCommandUndefined: Self = StObject.set(x, "enableExecuteCommand", js.undefined)
    
    inline def setForceNewDeployment(value: Boolean): Self = StObject.set(x, "forceNewDeployment", value.asInstanceOf[js.Any])
    
    inline def setForceNewDeploymentUndefined: Self = StObject.set(x, "forceNewDeployment", js.undefined)
    
    inline def setHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = StObject.set(x, "healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodSecondsUndefined: Self = StObject.set(x, "healthCheckGracePeriodSeconds", js.undefined)
    
    inline def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value*))
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setPlacementConstraints(value: PlacementConstraints): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
    
    inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
    
    inline def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = StObject.set(x, "placementConstraints", js.Array(value*))
    
    inline def setPlacementStrategy(value: PlacementStrategies): Self = StObject.set(x, "placementStrategy", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
    
    inline def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = StObject.set(x, "placementStrategy", js.Array(value*))
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setPropagateTags(value: PropagateTags): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceRegistries(value: ServiceRegistries): Self = StObject.set(x, "serviceRegistries", value.asInstanceOf[js.Any])
    
    inline def setServiceRegistriesUndefined: Self = StObject.set(x, "serviceRegistries", js.undefined)
    
    inline def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = StObject.set(x, "serviceRegistries", js.Array(value*))
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
  }
}
