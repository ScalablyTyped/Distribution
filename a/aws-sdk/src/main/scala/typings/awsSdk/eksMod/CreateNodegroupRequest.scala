package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNodegroupRequest extends js.Object {
  
  /**
    * The AMI type for your node group. GPU instance types should use the AL2_x86_64_GPU AMI type. Non-GPU instances should use the AL2_x86_64 AMI type. Arm instances should use the AL2_ARM_64 AMI type. All types use the Amazon EKS-optimized Amazon Linux 2 AMI. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify amiType, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var amiType: js.UndefOr[AMITypes] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster to create the node group in.
    */
  var clusterName: String = js.native
  
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify launchTemplate, then don't specify diskSize, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The instance type to use for your node group. You can specify a single instance type for a node group. The default value for instanceTypes is t3.medium. If you choose a GPU instance type, be sure to specify AL2_x86_64_GPU with the amiType parameter. If you specify launchTemplate, then don't specify instanceTypes, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  
  /**
    * The Kubernetes labels to be applied to the nodes in the node group when they are created.
    */
  var labels: js.UndefOr[labelsMap] = js.native
  
  /**
    * An object representing a node group's launch template specification. If specified, then do not specify instanceTypes, diskSize, or remoteAccess and make sure that the launch template meets the requirements in launchTemplateSpecification.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an IAM role for those worker nodes to use when they are launched. For more information, see Amazon EKS Worker Node IAM Role in the  Amazon EKS User Guide . If you specify launchTemplate, then don't specify  IamInstanceProfile  in your launch template, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var nodeRole: String = js.native
  
  /**
    * The unique name to give your node group.
    */
  var nodegroupName: String = js.native
  
  /**
    * The AMI version of the Amazon EKS-optimized AMI to use with your node group. By default, the latest available AMI version for the node group's current Kubernetes version is used. For more information, see Amazon EKS-Optimized Linux AMI Versions in the Amazon EKS User Guide. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify releaseVersion, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  
  /**
    * The remote access (SSH) configuration to use with your node group. If you specify launchTemplate, then don't specify remoteAccess, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.native
  
  /**
    * The scaling configuration details for the Auto Scaling group that is created for your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
  
  /**
    * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the tag key kubernetes.io/cluster/CLUSTER_NAME with a value of shared, where CLUSTER_NAME is replaced with the name of your cluster. If you specify launchTemplate, then don't specify  SubnetId  in your launch template, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var subnets: StringList = js.native
  
  /**
    * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used, and this is the only accepted specified value. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify version, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var version: js.UndefOr[String] = js.native
}
object CreateNodegroupRequest {
  
  @scala.inline
  def apply(clusterName: String, nodeRole: String, nodegroupName: String, subnets: StringList): CreateNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRole = nodeRole.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodegroupRequest]
  }
  
  @scala.inline
  implicit class CreateNodegroupRequestOps[Self <: CreateNodegroupRequest] (val x: Self) extends AnyVal {
    
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRole(value: String): Self = this.set("nodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupName(value: String): Self = this.set("nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiType(value: AMITypes): Self = this.set("amiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiType: Self = this.set("amiType", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setDiskSize(value: BoxedInteger): Self = this.set("diskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSize: Self = this.set("diskSize", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: String*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: StringList): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypes: Self = this.set("instanceTypes", js.undefined)
    
    @scala.inline
    def setLabels(value: labelsMap): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("launchTemplate", js.undefined)
    
    @scala.inline
    def setReleaseVersion(value: String): Self = this.set("releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseVersion: Self = this.set("releaseVersion", js.undefined)
    
    @scala.inline
    def setRemoteAccess(value: RemoteAccessConfig): Self = this.set("remoteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccess: Self = this.set("remoteAccess", js.undefined)
    
    @scala.inline
    def setScalingConfig(value: NodegroupScalingConfig): Self = this.set("scalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfig: Self = this.set("scalingConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
