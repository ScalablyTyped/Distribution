package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceDetails extends StObject {
  
  /**
    * The capacity provider strategy that the service uses.
    */
  var CapacityProviderStrategy: js.UndefOr[AwsEcsServiceCapacityProviderStrategyList] = js.undefined
  
  /**
    * The ARN of the cluster that hosts the service.
    */
  var Cluster: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Deployment parameters for the service. Includes the number of tasks that run and the order in which to start and stop tasks.
    */
  var DeploymentConfiguration: js.UndefOr[AwsEcsServiceDeploymentConfigurationDetails] = js.undefined
  
  /**
    * Contains the deployment controller type that the service uses.
    */
  var DeploymentController: js.UndefOr[AwsEcsServiceDeploymentControllerDetails] = js.undefined
  
  /**
    * The number of instantiations of the task definition to run on the service.
    */
  var DesiredCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether to enable Amazon ECS managed tags for the tasks in the service.
    */
  var EnableEcsManagedTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the execute command functionality is enabled for the service.
    */
  var EnableExecuteCommand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks.
    */
  var HealthCheckGracePeriodSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The launch type that the service uses. Valid values: EC2 | FARGATE | EXTERNAL 
    */
  var LaunchType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the load balancers that the service uses.
    */
  var LoadBalancers: js.UndefOr[AwsEcsServiceLoadBalancersList] = js.undefined
  
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For tasks that use the awsvpc networking mode, the VPC subnet and security group configuration.
    */
  var NetworkConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationDetails] = js.undefined
  
  /**
    * The placement constraints for the tasks in the service.
    */
  var PlacementConstraints: js.UndefOr[AwsEcsServicePlacementConstraintsList] = js.undefined
  
  /**
    * Information about how tasks for the service are placed.
    */
  var PlacementStrategies: js.UndefOr[AwsEcsServicePlacementStrategiesList] = js.undefined
  
  /**
    * The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If a platform version is not specified, the LATEST platform version is used by default.
    */
  var PlatformVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether to propagate the tags from the task definition to the task or from the service to the task. If no value is provided, then tags are not propagated. Valid values: TASK_DEFINITION | SERVICE 
    */
  var PropagateTags: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container agent to register container instances with an Elastic Load Balancing load balancer.
    */
  var Role: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The scheduling strategy to use for the service. The REPLICA scheduling strategy places and maintains the desired number of tasks across the cluster. By default, the service scheduler spreads tasks across Availability Zones. Task placement strategies and constraints are used to customize task placement decisions. The DAEMON scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that are specified in the cluster. The service scheduler also evaluates the task placement constraints for running tasks and stops tasks that do not meet the placement constraints. Valid values: REPLICA | DAEMON 
    */
  var SchedulingStrategy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the service.
    */
  var ServiceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the service. The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
    */
  var ServiceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the service discovery registries to assign to the service.
    */
  var ServiceRegistries: js.UndefOr[AwsEcsServiceServiceRegistriesList] = js.undefined
  
  /**
    * The task definition to use for tasks in the service.
    */
  var TaskDefinition: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServiceDetails {
  
  inline def apply(): AwsEcsServiceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceDetails]
  }
  
  extension [Self <: AwsEcsServiceDetails](x: Self) {
    
    inline def setCapacityProviderStrategy(value: AwsEcsServiceCapacityProviderStrategyList): Self = StObject.set(x, "CapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "CapacityProviderStrategy", js.undefined)
    
    inline def setCapacityProviderStrategyVarargs(value: AwsEcsServiceCapacityProviderStrategyDetails*): Self = StObject.set(x, "CapacityProviderStrategy", js.Array(value*))
    
    inline def setCluster(value: NonEmptyString): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
    
    inline def setDeploymentConfiguration(value: AwsEcsServiceDeploymentConfigurationDetails): Self = StObject.set(x, "DeploymentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigurationUndefined: Self = StObject.set(x, "DeploymentConfiguration", js.undefined)
    
    inline def setDeploymentController(value: AwsEcsServiceDeploymentControllerDetails): Self = StObject.set(x, "DeploymentController", value.asInstanceOf[js.Any])
    
    inline def setDeploymentControllerUndefined: Self = StObject.set(x, "DeploymentController", js.undefined)
    
    inline def setDesiredCount(value: Integer): Self = StObject.set(x, "DesiredCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredCountUndefined: Self = StObject.set(x, "DesiredCount", js.undefined)
    
    inline def setEnableEcsManagedTags(value: Boolean): Self = StObject.set(x, "EnableEcsManagedTags", value.asInstanceOf[js.Any])
    
    inline def setEnableEcsManagedTagsUndefined: Self = StObject.set(x, "EnableEcsManagedTags", js.undefined)
    
    inline def setEnableExecuteCommand(value: Boolean): Self = StObject.set(x, "EnableExecuteCommand", value.asInstanceOf[js.Any])
    
    inline def setEnableExecuteCommandUndefined: Self = StObject.set(x, "EnableExecuteCommand", js.undefined)
    
    inline def setHealthCheckGracePeriodSeconds(value: Integer): Self = StObject.set(x, "HealthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodSecondsUndefined: Self = StObject.set(x, "HealthCheckGracePeriodSeconds", js.undefined)
    
    inline def setLaunchType(value: NonEmptyString): Self = StObject.set(x, "LaunchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "LaunchType", js.undefined)
    
    inline def setLoadBalancers(value: AwsEcsServiceLoadBalancersList): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: AwsEcsServiceLoadBalancersDetails*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkConfiguration(value: AwsEcsServiceNetworkConfigurationDetails): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    inline def setPlacementConstraints(value: AwsEcsServicePlacementConstraintsList): Self = StObject.set(x, "PlacementConstraints", value.asInstanceOf[js.Any])
    
    inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "PlacementConstraints", js.undefined)
    
    inline def setPlacementConstraintsVarargs(value: AwsEcsServicePlacementConstraintsDetails*): Self = StObject.set(x, "PlacementConstraints", js.Array(value*))
    
    inline def setPlacementStrategies(value: AwsEcsServicePlacementStrategiesList): Self = StObject.set(x, "PlacementStrategies", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategiesUndefined: Self = StObject.set(x, "PlacementStrategies", js.undefined)
    
    inline def setPlacementStrategiesVarargs(value: AwsEcsServicePlacementStrategiesDetails*): Self = StObject.set(x, "PlacementStrategies", js.Array(value*))
    
    inline def setPlatformVersion(value: NonEmptyString): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setPropagateTags(value: NonEmptyString): Self = StObject.set(x, "PropagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "PropagateTags", js.undefined)
    
    inline def setRole(value: NonEmptyString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSchedulingStrategy(value: NonEmptyString): Self = StObject.set(x, "SchedulingStrategy", value.asInstanceOf[js.Any])
    
    inline def setSchedulingStrategyUndefined: Self = StObject.set(x, "SchedulingStrategy", js.undefined)
    
    inline def setServiceArn(value: NonEmptyString): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "ServiceArn", js.undefined)
    
    inline def setServiceName(value: NonEmptyString): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceRegistries(value: AwsEcsServiceServiceRegistriesList): Self = StObject.set(x, "ServiceRegistries", value.asInstanceOf[js.Any])
    
    inline def setServiceRegistriesUndefined: Self = StObject.set(x, "ServiceRegistries", js.undefined)
    
    inline def setServiceRegistriesVarargs(value: AwsEcsServiceServiceRegistriesDetails*): Self = StObject.set(x, "ServiceRegistries", js.Array(value*))
    
    inline def setTaskDefinition(value: NonEmptyString): Self = StObject.set(x, "TaskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "TaskDefinition", js.undefined)
  }
}
