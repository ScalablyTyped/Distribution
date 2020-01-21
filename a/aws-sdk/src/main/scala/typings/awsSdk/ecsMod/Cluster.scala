package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.native
  /**
    * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is created will be returned as a cluster attachment.
    */
  var attachments: js.UndefOr[Attachments] = js.native
  /**
    * The status of the capacity providers associated with the cluster. The following are the states that will be returned:  UPDATE_IN_PROGRESS  The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is provisioning or deprovisioning.  UPDATE_COMPLETE  The capacity providers have successfully updated.  UPDATE_FAILED  The capacity provider updates failed.  
    */
  var attachmentsStatus: js.UndefOr[String] = js.native
  /**
    * The capacity providers associated with the cluster.
    */
  var capacityProviders: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the arn:aws:ecs namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the cluster namespace, and then the cluster name. For example, arn:aws:ecs:region:012345678910:cluster/test.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * A user-generated string that you use to identify your cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
    */
  var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.native
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status.
    */
  var registeredContainerInstancesCount: js.UndefOr[Integer] = js.native
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.native
  /**
    * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or disabled for a cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.native
  /**
    * Additional information about your clusters that are separated by launch type, including:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.native
  /**
    * The status of the cluster. The following are the possible states that will be returned.  ACTIVE  The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.  PROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being created.  DEPROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being deleted.  FAILED  The cluster has capacity providers associated with it and the resources needed for the capacity provider have failed to create.  INACTIVE  The cluster has been deleted. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future, so you should not rely on INACTIVE clusters persisting.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
}

object Cluster {
  @scala.inline
  def apply(
    activeServicesCount: Int | scala.Double = null,
    attachments: Attachments = null,
    attachmentsStatus: String = null,
    capacityProviders: StringList = null,
    clusterArn: String = null,
    clusterName: String = null,
    defaultCapacityProviderStrategy: CapacityProviderStrategy = null,
    pendingTasksCount: Int | scala.Double = null,
    registeredContainerInstancesCount: Int | scala.Double = null,
    runningTasksCount: Int | scala.Double = null,
    settings: ClusterSettings = null,
    statistics: Statistics = null,
    status: String = null,
    tags: Tags = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (activeServicesCount != null) __obj.updateDynamic("activeServicesCount")(activeServicesCount.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attachmentsStatus != null) __obj.updateDynamic("attachmentsStatus")(attachmentsStatus.asInstanceOf[js.Any])
    if (capacityProviders != null) __obj.updateDynamic("capacityProviders")(capacityProviders.asInstanceOf[js.Any])
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (defaultCapacityProviderStrategy != null) __obj.updateDynamic("defaultCapacityProviderStrategy")(defaultCapacityProviderStrategy.asInstanceOf[js.Any])
    if (pendingTasksCount != null) __obj.updateDynamic("pendingTasksCount")(pendingTasksCount.asInstanceOf[js.Any])
    if (registeredContainerInstancesCount != null) __obj.updateDynamic("registeredContainerInstancesCount")(registeredContainerInstancesCount.asInstanceOf[js.Any])
    if (runningTasksCount != null) __obj.updateDynamic("runningTasksCount")(runningTasksCount.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

