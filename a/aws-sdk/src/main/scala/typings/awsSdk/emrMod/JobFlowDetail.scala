package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobFlowDetail extends js.Object {
  
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  
  /**
    * A list of the bootstrap actions run by the job flow.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.native
  
  /**
    * Describes the execution status of the job flow.
    */
  var ExecutionStatusDetail: JobFlowExecutionStatusDetail = js.native
  
  /**
    * Describes the Amazon EC2 instances of the job flow.
    */
  var Instances: JobFlowInstancesDetail = js.native
  
  /**
    * The job flow identifier.
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
  
  /**
    * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.native
  
  /**
    * The AWS KMS customer master key (CMK) used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
    */
  var LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.native
  
  /**
    * The location in Amazon S3 where log files for the job are stored.
    */
  var LogUri: js.UndefOr[XmlString] = js.native
  
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256 = js.native
  
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.native
  
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.native
  
  /**
    * A list of steps run by the job flow.
    */
  var Steps: js.UndefOr[StepDetailList] = js.native
  
  /**
    * A list of strings set by third party software when the job flow is launched. If you are not using third party software to manage the job flow this value is empty.
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.native
  
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
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
  implicit class JobFlowDetailOps[Self <: JobFlowDetail] (val x: Self) extends AnyVal {
    
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
    def setExecutionStatusDetail(value: JobFlowExecutionStatusDetail): Self = this.set("ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: JobFlowInstancesDetail): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = this.set("JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiVersion(value: XmlStringMaxLen256): Self = this.set("AmiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiVersion: Self = this.set("AmiVersion", js.undefined)
    
    @scala.inline
    def setAutoScalingRole(value: XmlString): Self = this.set("AutoScalingRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingRole: Self = this.set("AutoScalingRole", js.undefined)
    
    @scala.inline
    def setBootstrapActionsVarargs(value: BootstrapActionDetail*): Self = this.set("BootstrapActions", js.Array(value :_*))
    
    @scala.inline
    def setBootstrapActions(value: BootstrapActionDetailList): Self = this.set("BootstrapActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapActions: Self = this.set("BootstrapActions", js.undefined)
    
    @scala.inline
    def setJobFlowRole(value: XmlString): Self = this.set("JobFlowRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFlowRole: Self = this.set("JobFlowRole", js.undefined)
    
    @scala.inline
    def setLogEncryptionKmsKeyId(value: XmlString): Self = this.set("LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogEncryptionKmsKeyId: Self = this.set("LogEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setLogUri(value: XmlString): Self = this.set("LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUri: Self = this.set("LogUri", js.undefined)
    
    @scala.inline
    def setScaleDownBehavior(value: ScaleDownBehavior): Self = this.set("ScaleDownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleDownBehavior: Self = this.set("ScaleDownBehavior", js.undefined)
    
    @scala.inline
    def setServiceRole(value: XmlString): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: StepDetail*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: StepDetailList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("Steps", js.undefined)
    
    @scala.inline
    def setSupportedProductsVarargs(value: XmlStringMaxLen256*): Self = this.set("SupportedProducts", js.Array(value :_*))
    
    @scala.inline
    def setSupportedProducts(value: SupportedProductsList): Self = this.set("SupportedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedProducts: Self = this.set("SupportedProducts", js.undefined)
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = this.set("VisibleToAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleToAllUsers: Self = this.set("VisibleToAllUsers", js.undefined)
  }
}
