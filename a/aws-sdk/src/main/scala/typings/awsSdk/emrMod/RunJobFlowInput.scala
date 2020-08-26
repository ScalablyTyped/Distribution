package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunJobFlowInput extends js.Object {
  /**
    * A JSON string for selecting additional features.
    */
  var AdditionalInfo: js.UndefOr[XmlString] = js.native
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install and configure when launching the cluster. For a list of applications available for each Amazon EMR release version, see the Amazon EMR Release Guide.
    */
  var Applications: js.UndefOr[ApplicationList] = js.native
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.native
  /**
    * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom AMIs in Amazon EMR, see Using a Custom AMI in the Amazon EMR Management Guide. If omitted, the cluster uses the base Linux AMI for the ReleaseLabel specified. For Amazon EMR versions 2.x and 3.x, use AmiVersion instead. For information about creating a custom AMI, see Creating an Amazon EBS-Backed Linux AMI in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For information about finding an AMI ID, see Finding a Linux AMI. 
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.native
  /**
    * A specification of the number and type of Amazon EC2 instances.
    */
  var Instances: JobFlowInstancesConfig = js.native
  /**
    * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role. The default role is EMR_EC2_DefaultRole. In order to use the default role, you must have already created it using the CLI or console.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.native
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typings.awsSdk.emrMod.KerberosAttributes] = js.native
  /**
    * The AWS KMS customer master key (CMK) used for encrypting log files. If a value is not provided, the logs will remain encrypted by AES-256. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
    */
  var LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.native
  /**
    * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not created.
    */
  var LogUri: js.UndefOr[XmlString] = js.native
  /**
    *  The specified managed scaling policy for an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.ManagedScalingPolicy] = js.native
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use with the job flow that accepts a user argument list. EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the Amazon EMR Developer Guide. Supported values are:   "mapr-m3" - launch the cluster using MapR M3 Edition.   "mapr-m5" - launch the cluster using MapR M5 Edition.   "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition respectively.   "mapr-m7" - launch the cluster using MapR M7 Edition.   "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.   "hue"- launch the cluster with Hue installed.   "spark" - launch the cluster with Apache Spark installed.   "ganglia" - launch the cluster with the Ganglia Monitoring System installed.  
    */
  var NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.native
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version such as emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies only when CustomAmiID is used. Specifies which updates from the Amazon Linux AMI package repositories to apply automatically when the instance boots using the AMI. If omitted, the default is SECURITY, which indicates that only security updates are applied. If NONE is specified, no updates are applied, and all updates must be applied manually.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typings.awsSdk.emrMod.RepoUpgradeOnBoot] = js.native
  /**
    * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.native
  /**
    * The name of a security configuration to apply to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.native
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.native
  /**
    * Specifies the number of steps that can be executed concurrently. The default value is 1. The maximum value is 256.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
  /**
    * A list of steps to run.
    */
  var Steps: js.UndefOr[StepConfigList] = js.native
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use. For more information, see the Amazon EMR Developer Guide. Currently supported values are:   "mapr-m3" - launch the job flow using MapR M3 Edition.   "mapr-m5" - launch the job flow using MapR M5 Edition.  
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.native
  /**
    * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A value of true indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. This is the default. A value of false indicates that only the IAM user who created the cluster can perform actions.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
}

object RunJobFlowInput {
  @scala.inline
  def apply(Instances: JobFlowInstancesConfig, Name: XmlStringMaxLen256): RunJobFlowInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunJobFlowInput]
  }
  @scala.inline
  implicit class RunJobFlowInputOps[Self <: RunJobFlowInput] (val x: Self) extends AnyVal {
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
    def setInstances(value: JobFlowInstancesConfig): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalInfo(value: XmlString): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    @scala.inline
    def setAmiVersion(value: XmlStringMaxLen256): Self = this.set("AmiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiVersion: Self = this.set("AmiVersion", js.undefined)
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = this.set("Applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: ApplicationList): Self = this.set("Applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("Applications", js.undefined)
    @scala.inline
    def setAutoScalingRole(value: XmlString): Self = this.set("AutoScalingRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingRole: Self = this.set("AutoScalingRole", js.undefined)
    @scala.inline
    def setBootstrapActionsVarargs(value: BootstrapActionConfig*): Self = this.set("BootstrapActions", js.Array(value :_*))
    @scala.inline
    def setBootstrapActions(value: BootstrapActionConfigList): Self = this.set("BootstrapActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapActions: Self = this.set("BootstrapActions", js.undefined)
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    @scala.inline
    def setCustomAmiId(value: XmlStringMaxLen256): Self = this.set("CustomAmiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAmiId: Self = this.set("CustomAmiId", js.undefined)
    @scala.inline
    def setEbsRootVolumeSize(value: Integer): Self = this.set("EbsRootVolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsRootVolumeSize: Self = this.set("EbsRootVolumeSize", js.undefined)
    @scala.inline
    def setJobFlowRole(value: XmlString): Self = this.set("JobFlowRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobFlowRole: Self = this.set("JobFlowRole", js.undefined)
    @scala.inline
    def setKerberosAttributes(value: KerberosAttributes): Self = this.set("KerberosAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerberosAttributes: Self = this.set("KerberosAttributes", js.undefined)
    @scala.inline
    def setLogEncryptionKmsKeyId(value: XmlString): Self = this.set("LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogEncryptionKmsKeyId: Self = this.set("LogEncryptionKmsKeyId", js.undefined)
    @scala.inline
    def setLogUri(value: XmlString): Self = this.set("LogUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUri: Self = this.set("LogUri", js.undefined)
    @scala.inline
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = this.set("ManagedScalingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedScalingPolicy: Self = this.set("ManagedScalingPolicy", js.undefined)
    @scala.inline
    def setNewSupportedProductsVarargs(value: SupportedProductConfig*): Self = this.set("NewSupportedProducts", js.Array(value :_*))
    @scala.inline
    def setNewSupportedProducts(value: NewSupportedProductsList): Self = this.set("NewSupportedProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSupportedProducts: Self = this.set("NewSupportedProducts", js.undefined)
    @scala.inline
    def setReleaseLabel(value: XmlStringMaxLen256): Self = this.set("ReleaseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseLabel: Self = this.set("ReleaseLabel", js.undefined)
    @scala.inline
    def setRepoUpgradeOnBoot(value: RepoUpgradeOnBoot): Self = this.set("RepoUpgradeOnBoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepoUpgradeOnBoot: Self = this.set("RepoUpgradeOnBoot", js.undefined)
    @scala.inline
    def setScaleDownBehavior(value: ScaleDownBehavior): Self = this.set("ScaleDownBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleDownBehavior: Self = this.set("ScaleDownBehavior", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: XmlString): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
    @scala.inline
    def setServiceRole(value: XmlString): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    @scala.inline
    def setStepConcurrencyLevel(value: Integer): Self = this.set("StepConcurrencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepConcurrencyLevel: Self = this.set("StepConcurrencyLevel", js.undefined)
    @scala.inline
    def setStepsVarargs(value: StepConfig*): Self = this.set("Steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: StepConfigList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("Steps", js.undefined)
    @scala.inline
    def setSupportedProductsVarargs(value: XmlStringMaxLen256*): Self = this.set("SupportedProducts", js.Array(value :_*))
    @scala.inline
    def setSupportedProducts(value: SupportedProductsList): Self = this.set("SupportedProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedProducts: Self = this.set("SupportedProducts", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = this.set("VisibleToAllUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleToAllUsers: Self = this.set("VisibleToAllUsers", js.undefined)
  }
  
}

