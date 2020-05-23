package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSet extends js.Object {
  /**
    * The capacity provider strategy associated with the task set.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the cluster that the service that hosts the task set exists in.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * The computed desired count for the task set. This is calculated by multiplying the service's desiredCount by the task set's scale percentage. The result is always rounded up. For example, if the computed desired count is 1.2, it rounds up to 2 tasks.
    */
  var computedDesiredCount: js.UndefOr[Integer] = js.native
  /**
    * The Unix timestamp for when the task set was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The external ID associated with the task set. If a task set is created by an AWS CodeDeploy deployment, the externalId parameter contains the AWS CodeDeploy deployment ID. If a task set is created for an external deployment and is associated with a service discovery registry, the externalId parameter contains the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * The ID of the task set.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The launch type the tasks in the task set are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * Details on a load balancer that is used with a task set.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.native
  /**
    * The network configuration for the task set.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * The number of tasks in the task set that are in the PENDING status during a deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time or when it is restarted after being in the STOPPED state.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  /**
    * The platform version on which the tasks in the task set are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks in the task set that are in the RUNNING status during a deployment. A task in the RUNNING state is running and ready for use.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  var scale: js.UndefOr[Scale] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service the task set exists in.
    */
  var serviceArn: js.UndefOr[String] = js.native
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.native
  /**
    * The stability status, which indicates whether the task set has reached a steady state. If the following conditions are met, the task set will be in STEADY_STATE:   The task runningCount is equal to the computedDesiredCount.   The pendingCount is 0.   There are no tasks running on container instances in the DRAINING status.   All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.   If any of those conditions are not met, the stability status returns STABILIZING.
    */
  var stabilityStatus: js.UndefOr[StabilityStatus] = js.native
  /**
    * The Unix timestamp for when the task set stability status was retrieved.
    */
  var stabilityStatusAt: js.UndefOr[Timestamp] = js.native
  /**
    * The tag specified when a task set is started. If the task set is created by an AWS CodeDeploy deployment, the startedBy parameter is CODE_DEPLOY. For a task set created for an external deployment, the startedBy field isn't used.
    */
  var startedBy: js.UndefOr[String] = js.native
  /**
    * The status of the task set. The following describes each state:  PRIMARY  The task set is serving production traffic.  ACTIVE  The task set is not serving production traffic.  DRAINING  The tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the task set to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The task definition the task set is using.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task set.
    */
  var taskSetArn: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task set was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}

object TaskSet {
  @scala.inline
  def apply(
    capacityProviderStrategy: CapacityProviderStrategy = null,
    clusterArn: String = null,
    computedDesiredCount: js.UndefOr[Integer] = js.undefined,
    createdAt: Timestamp = null,
    externalId: String = null,
    id: String = null,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: js.UndefOr[Integer] = js.undefined,
    platformVersion: String = null,
    runningCount: js.UndefOr[Integer] = js.undefined,
    scale: Scale = null,
    serviceArn: String = null,
    serviceRegistries: ServiceRegistries = null,
    stabilityStatus: StabilityStatus = null,
    stabilityStatusAt: Timestamp = null,
    startedBy: String = null,
    status: String = null,
    tags: Tags = null,
    taskDefinition: String = null,
    taskSetArn: String = null,
    updatedAt: Timestamp = null
  ): TaskSet = {
    val __obj = js.Dynamic.literal()
    if (capacityProviderStrategy != null) __obj.updateDynamic("capacityProviderStrategy")(capacityProviderStrategy.asInstanceOf[js.Any])
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn.asInstanceOf[js.Any])
    if (!js.isUndefined(computedDesiredCount)) __obj.updateDynamic("computedDesiredCount")(computedDesiredCount.get.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount.get.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(runningCount)) __obj.updateDynamic("runningCount")(runningCount.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (serviceArn != null) __obj.updateDynamic("serviceArn")(serviceArn.asInstanceOf[js.Any])
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries.asInstanceOf[js.Any])
    if (stabilityStatus != null) __obj.updateDynamic("stabilityStatus")(stabilityStatus.asInstanceOf[js.Any])
    if (stabilityStatusAt != null) __obj.updateDynamic("stabilityStatusAt")(stabilityStatusAt.asInstanceOf[js.Any])
    if (startedBy != null) __obj.updateDynamic("startedBy")(startedBy.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition.asInstanceOf[js.Any])
    if (taskSetArn != null) __obj.updateDynamic("taskSetArn")(taskSetArn.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSet]
  }
}

