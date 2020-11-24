package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nodegroup extends js.Object {
  
  /**
    * If the node group was deployed using a launch template with a custom AMI, then this is CUSTOM. For node groups that weren't deployed using a launch template, this is the AMI type that was specified in the node group configuration.
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
    * If the node group wasn't deployed with a launch template, then this is the disk size in the node group configuration. If the node group was deployed with a launch template, then this is null.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The health status of the node group. If there are issues with your node group's health, they are listed here.
    */
  var health: js.UndefOr[NodegroupHealth] = js.native
  
  /**
    * If the node group wasn't deployed with a launch template, then this is the instance type that is associated with the node group. If the node group was deployed with a launch template, then this is null.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  
  /**
    * The Kubernetes labels applied to the nodes in the node group.  Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied to the nodes in this group. 
    */
  var labels: js.UndefOr[labelsMap] = js.native
  
  /**
    * If a launch template was used to create the node group, then this is the launch template that was used.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was last modified.
    */
  var modifiedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies.
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
    * If the node group was deployed using a launch template with a custom AMI, then this is the AMI ID that was specified in the launch template. For node groups that weren't deployed using a launch template, this is the version of the Amazon EKS-optimized AMI that the node group was deployed with.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  
  /**
    * If the node group wasn't deployed with a launch template, then this is the remote access configuration that is associated with the node group. If the node group was deployed with a launch template, then this is null.
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
    * The subnets that were specified for the Auto Scaling group that is associated with your node group.
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
  def apply(): Nodegroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nodegroup]
  }
  
  @scala.inline
  implicit class NodegroupOps[Self <: Nodegroup] (val x: Self) extends AnyVal {
    
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
    def setAmiType(value: AMITypes): Self = this.set("amiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiType: Self = this.set("amiType", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDiskSize(value: BoxedInteger): Self = this.set("diskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSize: Self = this.set("diskSize", js.undefined)
    
    @scala.inline
    def setHealth(value: NodegroupHealth): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
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
    def setModifiedAt(value: Timestamp): Self = this.set("modifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedAt: Self = this.set("modifiedAt", js.undefined)
    
    @scala.inline
    def setNodeRole(value: String): Self = this.set("nodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeRole: Self = this.set("nodeRole", js.undefined)
    
    @scala.inline
    def setNodegroupArn(value: String): Self = this.set("nodegroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodegroupArn: Self = this.set("nodegroupArn", js.undefined)
    
    @scala.inline
    def setNodegroupName(value: String): Self = this.set("nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodegroupName: Self = this.set("nodegroupName", js.undefined)
    
    @scala.inline
    def setReleaseVersion(value: String): Self = this.set("releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseVersion: Self = this.set("releaseVersion", js.undefined)
    
    @scala.inline
    def setRemoteAccess(value: RemoteAccessConfig): Self = this.set("remoteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccess: Self = this.set("remoteAccess", js.undefined)
    
    @scala.inline
    def setResources(value: NodegroupResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setScalingConfig(value: NodegroupScalingConfig): Self = this.set("scalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfig: Self = this.set("scalingConfig", js.undefined)
    
    @scala.inline
    def setStatus(value: NodegroupStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("subnets", js.undefined)
    
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
