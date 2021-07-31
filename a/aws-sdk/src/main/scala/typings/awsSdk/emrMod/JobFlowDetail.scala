package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFlowDetail extends StObject {
  
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A list of the bootstrap actions run by the job flow.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.undefined
  
  /**
    * Describes the execution status of the job flow.
    */
  var ExecutionStatusDetail: JobFlowExecutionStatusDetail
  
  /**
    * Describes the Amazon EC2 instances of the job flow.
    */
  var Instances: JobFlowInstancesDetail
  
  /**
    * The job flow identifier.
    */
  var JobFlowId: XmlStringMaxLen256
  
  /**
    * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The AWS KMS customer master key (CMK) used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
    */
  var LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The location in Amazon S3 where log files for the job are stored.
    */
  var LogUri: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256
  
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.undefined
  
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A list of steps run by the job flow.
    */
  var Steps: js.UndefOr[StepDetailList] = js.undefined
  
  /**
    * A list of strings set by third party software when the job flow is launched. If you are not using third party software to manage the job flow this value is empty.
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined
  
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
}
object JobFlowDetail {
  
  @scala.inline
  def apply(
    ExecutionStatusDetail: JobFlowExecutionStatusDetail,
    Instances: JobFlowInstancesDetail,
    JobFlowId: XmlStringMaxLen256,
    Name: XmlStringMaxLen256
  ): JobFlowDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowDetail]
  }
  
  @scala.inline
  implicit class JobFlowDetailMutableBuilder[Self <: JobFlowDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmiVersion(value: XmlStringMaxLen256): Self = StObject.set(x, "AmiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiVersionUndefined: Self = StObject.set(x, "AmiVersion", js.undefined)
    
    @scala.inline
    def setAutoScalingRole(value: XmlString): Self = StObject.set(x, "AutoScalingRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingRoleUndefined: Self = StObject.set(x, "AutoScalingRole", js.undefined)
    
    @scala.inline
    def setBootstrapActions(value: BootstrapActionDetailList): Self = StObject.set(x, "BootstrapActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapActionsUndefined: Self = StObject.set(x, "BootstrapActions", js.undefined)
    
    @scala.inline
    def setBootstrapActionsVarargs(value: BootstrapActionDetail*): Self = StObject.set(x, "BootstrapActions", js.Array(value :_*))
    
    @scala.inline
    def setExecutionStatusDetail(value: JobFlowExecutionStatusDetail): Self = StObject.set(x, "ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: JobFlowInstancesDetail): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowRole(value: XmlString): Self = StObject.set(x, "JobFlowRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowRoleUndefined: Self = StObject.set(x, "JobFlowRole", js.undefined)
    
    @scala.inline
    def setLogEncryptionKmsKeyId(value: XmlString): Self = StObject.set(x, "LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "LogEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setLogUri(value: XmlString): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownBehavior(value: ScaleDownBehavior): Self = StObject.set(x, "ScaleDownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownBehaviorUndefined: Self = StObject.set(x, "ScaleDownBehavior", js.undefined)
    
    @scala.inline
    def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setSteps(value: StepDetailList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: StepDetail*): Self = StObject.set(x, "Steps", js.Array(value :_*))
    
    @scala.inline
    def setSupportedProducts(value: SupportedProductsList): Self = StObject.set(x, "SupportedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProductsUndefined: Self = StObject.set(x, "SupportedProducts", js.undefined)
    
    @scala.inline
    def setSupportedProductsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "SupportedProducts", js.Array(value :_*))
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToAllUsersUndefined: Self = StObject.set(x, "VisibleToAllUsers", js.undefined)
  }
}
