package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceRequest extends js.Object {
  /**
    * The capacity provider strategy to update the service to use. If the service is using the default capacity provider strategy for the cluster, the service can be updated to use one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be updated to use the cluster's default capacity provider strategy. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created. 
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.native
  /**
    * The number of instantiations of the task to place and keep running in your service.
    */
  var desiredCount: js.UndefOr[BoxedInteger] = js.native
  /**
    * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to use a newer Docker image with the same image/tag combination (my_image:latest) or to roll Fargate tasks onto a newer platform version.
    */
  var forceNewDeployment: js.UndefOr[Boolean] = js.native
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.native
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * An array of task placement constraint objects to update the service to use. If no value is specified, the existing placement constraints for the service will remain unchanged. If this value is specified, it will override any existing placement constraints defined for the service. To remove all existing placement constraints, specify an empty array. You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.native
  /**
    * The task placement strategy objects to update the service to use. If no value is specified, the existing placement strategy for the service will remain unchanged. If this value is specified, it will override the existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty object. You can specify a maximum of five strategy rules per service.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.native
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If a platform version is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The name of the service to update.
    */
  var service: String = js.native
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. If you modify the task definition with UpdateService, Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the new version is running.
    */
  var taskDefinition: js.UndefOr[String] = js.native
}

object UpdateServiceRequest {
  @scala.inline
  def apply(service: String): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  @scala.inline
  implicit class UpdateServiceRequestOps[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = this.set("capacityProviderStrategy", js.Array(value :_*))
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = this.set("capacityProviderStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityProviderStrategy: Self = this.set("capacityProviderStrategy", js.undefined)
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setDeploymentConfiguration(value: DeploymentConfiguration): Self = this.set("deploymentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfiguration: Self = this.set("deploymentConfiguration", js.undefined)
    @scala.inline
    def setDesiredCount(value: BoxedInteger): Self = this.set("desiredCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredCount: Self = this.set("desiredCount", js.undefined)
    @scala.inline
    def setForceNewDeployment(value: Boolean): Self = this.set("forceNewDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceNewDeployment: Self = this.set("forceNewDeployment", js.undefined)
    @scala.inline
    def setHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = this.set("healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckGracePeriodSeconds: Self = this.set("healthCheckGracePeriodSeconds", js.undefined)
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = this.set("networkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfiguration: Self = this.set("networkConfiguration", js.undefined)
    @scala.inline
    def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = this.set("placementConstraints", js.Array(value :_*))
    @scala.inline
    def setPlacementConstraints(value: PlacementConstraints): Self = this.set("placementConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementConstraints: Self = this.set("placementConstraints", js.undefined)
    @scala.inline
    def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = this.set("placementStrategy", js.Array(value :_*))
    @scala.inline
    def setPlacementStrategy(value: PlacementStrategies): Self = this.set("placementStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategy: Self = this.set("placementStrategy", js.undefined)
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    @scala.inline
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefinition: Self = this.set("taskDefinition", js.undefined)
  }
  
}

