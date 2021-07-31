package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskSetRequest extends StObject {
  
  /**
    * The capacity provider strategy to use for the task set. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If a capacityProviderStrategy is specified, the launchType parameter must be omitted. If no capacityProviderStrategy or launchType is specified, the defaultCapacityProviderStrategy for the cluster is used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII characters are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
    */
  var cluster: String
  
  /**
    * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type that new tasks in the task set will use. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide. If a launchType is specified, the capacityProviderStrategy parameter must be omitted.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * A load balancer object representing the load balancer to use with the task set. The supported load balancer types are either an Application Load Balancer or a Network Load Balancer.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn't specified, the LATEST platform version is used by default.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[Scale] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
    */
  var service: String
  
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  
  /**
    * The metadata that you apply to the task set to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The task definition for the tasks in the task set to use.
    */
  var taskDefinition: String
}
object CreateTaskSetRequest {
  
  @scala.inline
  def apply(cluster: String, service: String, taskDefinition: String): CreateTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskSetRequest]
  }
  
  @scala.inline
  implicit class CreateTaskSetRequestMutableBuilder[Self <: CreateTaskSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRegistries(value: ServiceRegistries): Self = StObject.set(x, "serviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRegistriesUndefined: Self = StObject.set(x, "serviceRegistries", js.undefined)
    
    @scala.inline
    def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = StObject.set(x, "serviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
  }
}
