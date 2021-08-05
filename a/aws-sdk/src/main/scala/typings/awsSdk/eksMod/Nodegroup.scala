package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodegroup extends StObject {
  
  /**
    * If the node group was deployed using a launch template with a custom AMI, then this is CUSTOM. For node groups that weren't deployed using a launch template, this is the AMI type that was specified in the node group configuration.
    */
  var amiType: js.UndefOr[AMITypes] = js.undefined
  
  /**
    * The name of the cluster that the managed node group resides in.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If the node group wasn't deployed with a launch template, then this is the disk size in the node group configuration. If the node group was deployed with a launch template, then this is null.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The health status of the node group. If there are issues with your node group's health, they are listed here.
    */
  var health: js.UndefOr[NodegroupHealth] = js.undefined
  
  /**
    * If the node group wasn't deployed with a launch template, then this is the instance type that is associated with the node group. If the node group was deployed with a launch template, then this is null.
    */
  var instanceTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Kubernetes labels applied to the nodes in the node group.  Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied to the nodes in this group. 
    */
  var labels: js.UndefOr[labelsMap] = js.undefined
  
  /**
    * If a launch template was used to create the node group, then this is the launch template that was used.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was last modified.
    */
  var modifiedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies.
    */
  var nodeRole: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with the managed node group.
    */
  var nodegroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name associated with an Amazon EKS managed node group.
    */
  var nodegroupName: js.UndefOr[String] = js.undefined
  
  /**
    * If the node group was deployed using a launch template with a custom AMI, then this is the AMI ID that was specified in the launch template. For node groups that weren't deployed using a launch template, this is the version of the Amazon EKS-optimized AMI that the node group was deployed with.
    */
  var releaseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If the node group wasn't deployed with a launch template, then this is the remote access configuration that is associated with the node group. If the node group was deployed with a launch template, then this is null.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.undefined
  
  /**
    * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
    */
  var resources: js.UndefOr[NodegroupResources] = js.undefined
  
  /**
    * The scaling configuration details for the Auto Scaling group that is associated with your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined
  
  /**
    * The current status of the managed node group.
    */
  var status: js.UndefOr[NodegroupStatus] = js.undefined
  
  /**
    * The subnets that were specified for the Auto Scaling group that is associated with your node group.
    */
  var subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Kubernetes version of the managed node group.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Nodegroup {
  
  inline def apply(): Nodegroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nodegroup]
  }
  
  extension [Self <: Nodegroup](x: Self) {
    
    inline def setAmiType(value: AMITypes): Self = StObject.set(x, "amiType", value.asInstanceOf[js.Any])
    
    inline def setAmiTypeUndefined: Self = StObject.set(x, "amiType", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDiskSize(value: BoxedInteger): Self = StObject.set(x, "diskSize", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeUndefined: Self = StObject.set(x, "diskSize", js.undefined)
    
    inline def setHealth(value: NodegroupHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setInstanceTypes(value: StringList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    
    inline def setLabels(value: labelsMap): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    inline def setModifiedAt(value: Timestamp): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    inline def setNodeRole(value: String): Self = StObject.set(x, "nodeRole", value.asInstanceOf[js.Any])
    
    inline def setNodeRoleUndefined: Self = StObject.set(x, "nodeRole", js.undefined)
    
    inline def setNodegroupArn(value: String): Self = StObject.set(x, "nodegroupArn", value.asInstanceOf[js.Any])
    
    inline def setNodegroupArnUndefined: Self = StObject.set(x, "nodegroupArn", js.undefined)
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    inline def setNodegroupNameUndefined: Self = StObject.set(x, "nodegroupName", js.undefined)
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setRemoteAccess(value: RemoteAccessConfig): Self = StObject.set(x, "remoteAccess", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessUndefined: Self = StObject.set(x, "remoteAccess", js.undefined)
    
    inline def setResources(value: NodegroupResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setScalingConfig(value: NodegroupScalingConfig): Self = StObject.set(x, "scalingConfig", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigUndefined: Self = StObject.set(x, "scalingConfig", js.undefined)
    
    inline def setStatus(value: NodegroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
