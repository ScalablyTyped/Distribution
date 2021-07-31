package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunJobFlowInput extends StObject {
  
  /**
    * A JSON string for selecting additional features.
    */
  var AdditionalInfo: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install and configure when launching the cluster. For a list of applications available for each Amazon EMR release version, see the Amazon EMR Release Guide.
    */
  var Applications: js.UndefOr[ApplicationList] = js.undefined
  
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.undefined
  
  /**
    * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom AMIs in Amazon EMR, see Using a Custom AMI in the Amazon EMR Management Guide. If omitted, the cluster uses the base Linux AMI for the ReleaseLabel specified. For Amazon EMR versions 2.x and 3.x, use AmiVersion instead. For information about creating a custom AMI, see Creating an Amazon EBS-Backed Linux AMI in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For information about finding an AMI ID, see Finding a Linux AMI. 
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * A specification of the number and type of Amazon EC2 instances.
    */
  var Instances: JobFlowInstancesConfig
  
  /**
    * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role. The default role is EMR_EC2_DefaultRole. In order to use the default role, you must have already created it using the CLI or console.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typings.awsSdk.emrMod.KerberosAttributes] = js.undefined
  
  /**
    * The AWS KMS customer master key (CMK) used for encrypting log files. If a value is not provided, the logs will remain encrypted by AES-256. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
    */
  var LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not created.
    */
  var LogUri: js.UndefOr[XmlString] = js.undefined
  
  /**
    *  The specified managed scaling policy for an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.ManagedScalingPolicy] = js.undefined
  
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256
  
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use with the job flow that accepts a user argument list. EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the Amazon EMR Developer Guide. Supported values are:   "mapr-m3" - launch the cluster using MapR M3 Edition.   "mapr-m5" - launch the cluster using MapR M5 Edition.   "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition respectively.   "mapr-m7" - launch the cluster using MapR M7 Edition.   "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.   "hue"- launch the cluster with Hue installed.   "spark" - launch the cluster with Apache Spark installed.   "ganglia" - launch the cluster with the Ganglia Monitoring System installed.  
    */
  var NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.undefined
  
  /**
    * The specified placement group configuration for an Amazon EMR cluster.
    */
  var PlacementGroupConfigs: js.UndefOr[PlacementGroupConfigList] = js.undefined
  
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version such as emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Applies only when CustomAmiID is used. Specifies which updates from the Amazon Linux AMI package repositories to apply automatically when the instance boots using the AMI. If omitted, the default is SECURITY, which indicates that only security updates are applied. If NONE is specified, no updates are applied, and all updates must be applied manually.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typings.awsSdk.emrMod.RepoUpgradeOnBoot] = js.undefined
  
  /**
    * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.undefined
  
  /**
    * The name of a security configuration to apply to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Specifies the number of steps that can be executed concurrently. The default value is 1. The maximum value is 256.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of steps to run.
    */
  var Steps: js.UndefOr[StepConfigList] = js.undefined
  
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use. For more information, see the Amazon EMR Developer Guide. Currently supported values are:   "mapr-m3" - launch the job flow using MapR M3 Edition.   "mapr-m5" - launch the job flow using MapR M5 Edition.  
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined
  
  /**
    * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A value of true indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. This is the default. A value of false indicates that only the IAM user who created the cluster can perform actions.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
}
object RunJobFlowInput {
  
  @scala.inline
  def apply(Instances: JobFlowInstancesConfig, Name: XmlStringMaxLen256): RunJobFlowInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunJobFlowInput]
  }
  
  @scala.inline
  implicit class RunJobFlowInputMutableBuilder[Self <: RunJobFlowInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInfo(value: XmlString): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    @scala.inline
    def setAmiVersion(value: XmlStringMaxLen256): Self = StObject.set(x, "AmiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiVersionUndefined: Self = StObject.set(x, "AmiVersion", js.undefined)
    
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
    def setBootstrapActions(value: BootstrapActionConfigList): Self = StObject.set(x, "BootstrapActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapActionsUndefined: Self = StObject.set(x, "BootstrapActions", js.undefined)
    
    @scala.inline
    def setBootstrapActionsVarargs(value: BootstrapActionConfig*): Self = StObject.set(x, "BootstrapActions", js.Array(value :_*))
    
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
    def setInstances(value: JobFlowInstancesConfig): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowRole(value: XmlString): Self = StObject.set(x, "JobFlowRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowRoleUndefined: Self = StObject.set(x, "JobFlowRole", js.undefined)
    
    @scala.inline
    def setKerberosAttributes(value: KerberosAttributes): Self = StObject.set(x, "KerberosAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerberosAttributesUndefined: Self = StObject.set(x, "KerberosAttributes", js.undefined)
    
    @scala.inline
    def setLogEncryptionKmsKeyId(value: XmlString): Self = StObject.set(x, "LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "LogEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setLogUri(value: XmlString): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = StObject.set(x, "ManagedScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedScalingPolicyUndefined: Self = StObject.set(x, "ManagedScalingPolicy", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSupportedProducts(value: NewSupportedProductsList): Self = StObject.set(x, "NewSupportedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSupportedProductsUndefined: Self = StObject.set(x, "NewSupportedProducts", js.undefined)
    
    @scala.inline
    def setNewSupportedProductsVarargs(value: SupportedProductConfig*): Self = StObject.set(x, "NewSupportedProducts", js.Array(value :_*))
    
    @scala.inline
    def setPlacementGroupConfigs(value: PlacementGroupConfigList): Self = StObject.set(x, "PlacementGroupConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupConfigsUndefined: Self = StObject.set(x, "PlacementGroupConfigs", js.undefined)
    
    @scala.inline
    def setPlacementGroupConfigsVarargs(value: PlacementGroupConfig*): Self = StObject.set(x, "PlacementGroupConfigs", js.Array(value :_*))
    
    @scala.inline
    def setReleaseLabel(value: XmlStringMaxLen256): Self = StObject.set(x, "ReleaseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseLabelUndefined: Self = StObject.set(x, "ReleaseLabel", js.undefined)
    
    @scala.inline
    def setRepoUpgradeOnBoot(value: RepoUpgradeOnBoot): Self = StObject.set(x, "RepoUpgradeOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoUpgradeOnBootUndefined: Self = StObject.set(x, "RepoUpgradeOnBoot", js.undefined)
    
    @scala.inline
    def setScaleDownBehavior(value: ScaleDownBehavior): Self = StObject.set(x, "ScaleDownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownBehaviorUndefined: Self = StObject.set(x, "ScaleDownBehavior", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: XmlString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
    
    @scala.inline
    def setSteps(value: StepConfigList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: StepConfig*): Self = StObject.set(x, "Steps", js.Array(value :_*))
    
    @scala.inline
    def setSupportedProducts(value: SupportedProductsList): Self = StObject.set(x, "SupportedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProductsUndefined: Self = StObject.set(x, "SupportedProducts", js.undefined)
    
    @scala.inline
    def setSupportedProductsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "SupportedProducts", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToAllUsersUndefined: Self = StObject.set(x, "VisibleToAllUsers", js.undefined)
  }
}
