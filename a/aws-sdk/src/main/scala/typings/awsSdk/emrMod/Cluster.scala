package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends StObject {
  
  /**
    * The applications installed on this cluster.
    */
  var Applications: js.UndefOr[ApplicationList] = js.native
  
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  
  /**
    * Specifies whether the cluster should terminate after completing all steps.
    */
  var AutoTerminate: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * Applies only to Amazon EMR releases 4.x and later. The list of Configurations supplied to the EMR cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.native
  
  /**
    * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM instance profile, and so on.
    */
  var Ec2InstanceAttributes: js.UndefOr[typings.awsSdk.emrMod.Ec2InstanceAttributes] = js.native
  
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.native
  
  /**
    *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  The instance group configuration of the cluster. A value of INSTANCE_GROUP indicates a uniform instance group configuration. A value of INSTANCE_FLEET indicates an instance fleets configuration.
    */
  var InstanceCollectionType: js.UndefOr[typings.awsSdk.emrMod.InstanceCollectionType] = js.native
  
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typings.awsSdk.emrMod.KerberosAttributes] = js.native
  
  /**
    *  The AWS KMS customer master key (CMK) used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0. 
    */
  var LogEncryptionKmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The path to the Amazon S3 location where logs for this cluster are stored.
    */
  var LogUri: js.UndefOr[String] = js.native
  
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the Outpost where the cluster is launched. 
    */
  var OutpostArn: js.UndefOr[OptionalArnType] = js.native
  
  /**
    * Placement group configured for an Amazon EMR cluster.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupConfigList] = js.native
  
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version such as emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[String] = js.native
  
  /**
    * Applies only when CustomAmiID is used. Specifies the type of updates that are applied from the Amazon Linux AMI package repositories when an instance boots using the AMI.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typings.awsSdk.emrMod.RepoUpgradeOnBoot] = js.native
  
  /**
    * The AMI version requested for this cluster.
    */
  var RequestedAmiVersion: js.UndefOr[String] = js.native
  
  /**
    * The AMI version running on this cluster.
    */
  var RunningAmiVersion: js.UndefOr[String] = js.native
  
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION is available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.native
  
  /**
    * The name of the security configuration applied to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.native
  
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[String] = js.native
  
  /**
    * The current status details about the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.native
  
  /**
    * Specifies the number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
  
  /**
    * A list of tags associated with a cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API call or user intervention, or in the event of a cluster error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
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
    def setApplications(value: ApplicationList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value :_*))
    
    @scala.inline
    def setAutoScalingRole(value: XmlString): Self = StObject.set(x, "AutoScalingRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingRoleUndefined: Self = StObject.set(x, "AutoScalingRole", js.undefined)
    
    @scala.inline
    def setAutoTerminate(value: Boolean): Self = StObject.set(x, "AutoTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTerminateUndefined: Self = StObject.set(x, "AutoTerminate", js.undefined)
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    @scala.inline
    def setEbsRootVolumeSize(value: Integer): Self = StObject.set(x, "EbsRootVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsRootVolumeSizeUndefined: Self = StObject.set(x, "EbsRootVolumeSize", js.undefined)
    
    @scala.inline
    def setEc2InstanceAttributes(value: Ec2InstanceAttributes): Self = StObject.set(x, "Ec2InstanceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceAttributesUndefined: Self = StObject.set(x, "Ec2InstanceAttributes", js.undefined)
    
    @scala.inline
    def setId(value: ClusterId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceCollectionType(value: InstanceCollectionType): Self = StObject.set(x, "InstanceCollectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCollectionTypeUndefined: Self = StObject.set(x, "InstanceCollectionType", js.undefined)
    
    @scala.inline
    def setKerberosAttributes(value: KerberosAttributes): Self = StObject.set(x, "KerberosAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerberosAttributesUndefined: Self = StObject.set(x, "KerberosAttributes", js.undefined)
    
    @scala.inline
    def setLogEncryptionKmsKeyId(value: String): Self = StObject.set(x, "LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "LogEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setLogUri(value: String): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setMasterPublicDnsName(value: String): Self = StObject.set(x, "MasterPublicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterPublicDnsNameUndefined: Self = StObject.set(x, "MasterPublicDnsName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNormalizedInstanceHours(value: Integer): Self = StObject.set(x, "NormalizedInstanceHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedInstanceHoursUndefined: Self = StObject.set(x, "NormalizedInstanceHours", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: OptionalArnType): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setPlacementGroups(value: PlacementGroupConfigList): Self = StObject.set(x, "PlacementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupsUndefined: Self = StObject.set(x, "PlacementGroups", js.undefined)
    
    @scala.inline
    def setPlacementGroupsVarargs(value: PlacementGroupConfig*): Self = StObject.set(x, "PlacementGroups", js.Array(value :_*))
    
    @scala.inline
    def setReleaseLabel(value: String): Self = StObject.set(x, "ReleaseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseLabelUndefined: Self = StObject.set(x, "ReleaseLabel", js.undefined)
    
    @scala.inline
    def setRepoUpgradeOnBoot(value: RepoUpgradeOnBoot): Self = StObject.set(x, "RepoUpgradeOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoUpgradeOnBootUndefined: Self = StObject.set(x, "RepoUpgradeOnBoot", js.undefined)
    
    @scala.inline
    def setRequestedAmiVersion(value: String): Self = StObject.set(x, "RequestedAmiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedAmiVersionUndefined: Self = StObject.set(x, "RequestedAmiVersion", js.undefined)
    
    @scala.inline
    def setRunningAmiVersion(value: String): Self = StObject.set(x, "RunningAmiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningAmiVersionUndefined: Self = StObject.set(x, "RunningAmiVersion", js.undefined)
    
    @scala.inline
    def setScaleDownBehavior(value: ScaleDownBehavior): Self = StObject.set(x, "ScaleDownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownBehaviorUndefined: Self = StObject.set(x, "ScaleDownBehavior", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: XmlString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setServiceRole(value: String): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setStatus(value: ClusterStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTerminationProtected(value: Boolean): Self = StObject.set(x, "TerminationProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationProtectedUndefined: Self = StObject.set(x, "TerminationProtected", js.undefined)
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToAllUsersUndefined: Self = StObject.set(x, "VisibleToAllUsers", js.undefined)
  }
}
