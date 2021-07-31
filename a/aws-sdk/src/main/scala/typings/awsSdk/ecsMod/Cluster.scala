package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is created will be returned as a cluster attachment.
    */
  var attachments: js.UndefOr[Attachments] = js.undefined
  
  /**
    * The status of the capacity providers associated with the cluster. The following are the states that will be returned:  UPDATE_IN_PROGRESS  The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is provisioning or deprovisioning.  UPDATE_COMPLETE  The capacity providers have successfully updated.  UPDATE_FAILED  The capacity provider updates failed.  
    */
  var attachmentsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity providers associated with the cluster.
    */
  var capacityProviders: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the arn:aws:ecs namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the cluster namespace, and then the cluster name. For example, arn:aws:ecs:region:012345678910:cluster/test.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * A user-generated string that you use to identify your cluster.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
    */
  var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status.
    */
  var registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or disabled for a cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.undefined
  
  /**
    * Additional information about your clusters that are separated by launch type, including:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.undefined
  
  /**
    * The status of the cluster. The following are the possible states that will be returned.  ACTIVE  The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.  PROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being created.  DEPROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being deleted.  FAILED  The cluster has capacity providers associated with it and the resources needed for the capacity provider have failed to create.  INACTIVE  The cluster has been deleted. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future, so you should not rely on INACTIVE clusters persisting.  
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveServicesCount(value: Integer): Self = StObject.set(x, "activeServicesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveServicesCountUndefined: Self = StObject.set(x, "activeServicesCount", js.undefined)
    
    @scala.inline
    def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsStatus(value: String): Self = StObject.set(x, "attachmentsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsStatusUndefined: Self = StObject.set(x, "attachmentsStatus", js.undefined)
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setCapacityProviders(value: StringList): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
    
    @scala.inline
    def setCapacityProvidersVarargs(value: String*): Self = StObject.set(x, "capacityProviders", js.Array(value :_*))
    
    @scala.inline
    def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "defaultCapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCapacityProviderStrategyUndefined: Self = StObject.set(x, "defaultCapacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setDefaultCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "defaultCapacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setPendingTasksCount(value: Integer): Self = StObject.set(x, "pendingTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTasksCountUndefined: Self = StObject.set(x, "pendingTasksCount", js.undefined)
    
    @scala.inline
    def setRegisteredContainerInstancesCount(value: Integer): Self = StObject.set(x, "registeredContainerInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredContainerInstancesCountUndefined: Self = StObject.set(x, "registeredContainerInstancesCount", js.undefined)
    
    @scala.inline
    def setRunningTasksCount(value: Integer): Self = StObject.set(x, "runningTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTasksCountUndefined: Self = StObject.set(x, "runningTasksCount", js.undefined)
    
    @scala.inline
    def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: Statistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatisticsVarargs(value: KeyValuePair*): Self = StObject.set(x, "statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
