package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodegroup extends js.Object {
  /**
    * The AMI type associated with your node group. GPU instance types should use the AL2_x86_64_GPU AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the AL2_x86_64 AMI type, which uses the Amazon EKS-optimized Linux AMI.
    */
  var amiType: js.UndefOr[AMITypes] = js.native
  /**
    * The name of the cluster that the managed node group resides in.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  /**
    * The health status of the node group. If there are issues with your node group's health, they are listed here.
    */
  var health: js.UndefOr[NodegroupHealth] = js.native
  /**
    * The instance types associated with your node group.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  /**
    * The Kubernetes labels applied to the nodes in the node group.  Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied to the nodes in this group. 
    */
  var labels: js.UndefOr[labelsMap] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was last modified.
    */
  var modifiedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an IAM role for those worker nodes to use when they are launched. For more information, see Amazon EKS Worker Node IAM Role in the  Amazon EKS User Guide .
    */
  var nodeRole: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the managed node group.
    */
  var nodegroupArn: js.UndefOr[String] = js.native
  /**
    * The name associated with an Amazon EKS managed node group.
    */
  var nodegroupName: js.UndefOr[String] = js.native
  /**
    * The AMI version of the managed node group. For more information, see Amazon EKS-Optimized Linux AMI Versions  in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * The remote access (SSH) configuration that is associated with the node group.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.native
  /**
    * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
    */
  var resources: js.UndefOr[NodegroupResources] = js.native
  /**
    * The scaling configuration details for the Auto Scaling group that is associated with your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
  /**
    * The current status of the managed node group.
    */
  var status: js.UndefOr[NodegroupStatus] = js.native
  /**
    * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have the following tag: kubernetes.io/cluster/CLUSTER_NAME, where CLUSTER_NAME is replaced with the name of your cluster.
    */
  var subnets: js.UndefOr[StringList] = js.native
  /**
    * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Kubernetes version of the managed node group.
    */
  var version: js.UndefOr[String] = js.native
}

object Nodegroup {
  @scala.inline
  def apply(
    amiType: AMITypes = null,
    clusterName: String = null,
    createdAt: Timestamp = null,
    diskSize: Int | Double = null,
    health: NodegroupHealth = null,
    instanceTypes: StringList = null,
    labels: labelsMap = null,
    modifiedAt: Timestamp = null,
    nodeRole: String = null,
    nodegroupArn: String = null,
    nodegroupName: String = null,
    releaseVersion: String = null,
    remoteAccess: RemoteAccessConfig = null,
    resources: NodegroupResources = null,
    scalingConfig: NodegroupScalingConfig = null,
    status: NodegroupStatus = null,
    subnets: StringList = null,
    tags: TagMap = null,
    version: String = null
  ): Nodegroup = {
    val __obj = js.Dynamic.literal()
    if (amiType != null) __obj.updateDynamic("amiType")(amiType.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (diskSize != null) __obj.updateDynamic("diskSize")(diskSize.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (instanceTypes != null) __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (modifiedAt != null) __obj.updateDynamic("modifiedAt")(modifiedAt.asInstanceOf[js.Any])
    if (nodeRole != null) __obj.updateDynamic("nodeRole")(nodeRole.asInstanceOf[js.Any])
    if (nodegroupArn != null) __obj.updateDynamic("nodegroupArn")(nodegroupArn.asInstanceOf[js.Any])
    if (nodegroupName != null) __obj.updateDynamic("nodegroupName")(nodegroupName.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (remoteAccess != null) __obj.updateDynamic("remoteAccess")(remoteAccess.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (scalingConfig != null) __obj.updateDynamic("scalingConfig")(scalingConfig.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodegroup]
  }
}

