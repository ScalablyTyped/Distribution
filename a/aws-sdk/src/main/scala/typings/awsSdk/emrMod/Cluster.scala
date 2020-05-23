package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
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
  def apply(
    Applications: ApplicationList = null,
    AutoScalingRole: XmlString = null,
    AutoTerminate: js.UndefOr[Boolean] = js.undefined,
    ClusterArn: ArnType = null,
    Configurations: ConfigurationList = null,
    CustomAmiId: XmlStringMaxLen256 = null,
    EbsRootVolumeSize: js.UndefOr[Integer] = js.undefined,
    Ec2InstanceAttributes: Ec2InstanceAttributes = null,
    Id: ClusterId = null,
    InstanceCollectionType: InstanceCollectionType = null,
    KerberosAttributes: KerberosAttributes = null,
    LogUri: String = null,
    MasterPublicDnsName: String = null,
    Name: String = null,
    NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined,
    OutpostArn: OptionalArnType = null,
    ReleaseLabel: String = null,
    RepoUpgradeOnBoot: RepoUpgradeOnBoot = null,
    RequestedAmiVersion: String = null,
    RunningAmiVersion: String = null,
    ScaleDownBehavior: ScaleDownBehavior = null,
    SecurityConfiguration: XmlString = null,
    ServiceRole: String = null,
    Status: ClusterStatus = null,
    StepConcurrencyLevel: js.UndefOr[Integer] = js.undefined,
    Tags: TagList = null,
    TerminationProtected: js.UndefOr[Boolean] = js.undefined,
    VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (Applications != null) __obj.updateDynamic("Applications")(Applications.asInstanceOf[js.Any])
    if (AutoScalingRole != null) __obj.updateDynamic("AutoScalingRole")(AutoScalingRole.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoTerminate)) __obj.updateDynamic("AutoTerminate")(AutoTerminate.get.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (CustomAmiId != null) __obj.updateDynamic("CustomAmiId")(CustomAmiId.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsRootVolumeSize)) __obj.updateDynamic("EbsRootVolumeSize")(EbsRootVolumeSize.get.asInstanceOf[js.Any])
    if (Ec2InstanceAttributes != null) __obj.updateDynamic("Ec2InstanceAttributes")(Ec2InstanceAttributes.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InstanceCollectionType != null) __obj.updateDynamic("InstanceCollectionType")(InstanceCollectionType.asInstanceOf[js.Any])
    if (KerberosAttributes != null) __obj.updateDynamic("KerberosAttributes")(KerberosAttributes.asInstanceOf[js.Any])
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri.asInstanceOf[js.Any])
    if (MasterPublicDnsName != null) __obj.updateDynamic("MasterPublicDnsName")(MasterPublicDnsName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(NormalizedInstanceHours)) __obj.updateDynamic("NormalizedInstanceHours")(NormalizedInstanceHours.get.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (ReleaseLabel != null) __obj.updateDynamic("ReleaseLabel")(ReleaseLabel.asInstanceOf[js.Any])
    if (RepoUpgradeOnBoot != null) __obj.updateDynamic("RepoUpgradeOnBoot")(RepoUpgradeOnBoot.asInstanceOf[js.Any])
    if (RequestedAmiVersion != null) __obj.updateDynamic("RequestedAmiVersion")(RequestedAmiVersion.asInstanceOf[js.Any])
    if (RunningAmiVersion != null) __obj.updateDynamic("RunningAmiVersion")(RunningAmiVersion.asInstanceOf[js.Any])
    if (ScaleDownBehavior != null) __obj.updateDynamic("ScaleDownBehavior")(ScaleDownBehavior.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(StepConcurrencyLevel)) __obj.updateDynamic("StepConcurrencyLevel")(StepConcurrencyLevel.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TerminationProtected)) __obj.updateDynamic("TerminationProtected")(TerminationProtected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VisibleToAllUsers)) __obj.updateDynamic("VisibleToAllUsers")(VisibleToAllUsers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

