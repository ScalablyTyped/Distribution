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
    * The KMS key used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
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
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR adds nodes to a deny list and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsSdk.emrMod.ScaleDownBehavior] = js.undefined
  
  /**
    * The IAM role that is assumed by the Amazon EMR service to access Amazon Web Services resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A list of steps run by the job flow.
    */
  var Steps: js.UndefOr[StepDetailList] = js.undefined
  
  /**
    * A list of strings set by third-party software when the job flow is launched. If you are not using third-party software to manage the job flow, this value is empty.
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined
  
  /**
    * Indicates whether the cluster is visible to IAM principals in the Amazon Web Services account associated with the cluster. When true, IAM principals in the Amazon Web Services account can perform EMR cluster actions that their IAM policies allow. When false, only the IAM principal that created the cluster and the Amazon Web Services account root user can perform EMR actions, regardless of IAM permissions policies attached to other IAM principals. The default value is true if a value is not provided when creating a cluster using the EMR API RunJobFlow command, the CLI create-cluster command, or the Amazon Web Services Management Console.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
}
object JobFlowDetail {
  
  inline def apply(
    ExecutionStatusDetail: JobFlowExecutionStatusDetail,
    Instances: JobFlowInstancesDetail,
    JobFlowId: XmlStringMaxLen256,
    Name: XmlStringMaxLen256
  ): JobFlowDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowDetail]
  }
  
  extension [Self <: JobFlowDetail](x: Self) {
    
    inline def setAmiVersion(value: XmlStringMaxLen256): Self = StObject.set(x, "AmiVersion", value.asInstanceOf[js.Any])
    
    inline def setAmiVersionUndefined: Self = StObject.set(x, "AmiVersion", js.undefined)
    
    inline def setAutoScalingRole(value: XmlString): Self = StObject.set(x, "AutoScalingRole", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingRoleUndefined: Self = StObject.set(x, "AutoScalingRole", js.undefined)
    
    inline def setBootstrapActions(value: BootstrapActionDetailList): Self = StObject.set(x, "BootstrapActions", value.asInstanceOf[js.Any])
    
    inline def setBootstrapActionsUndefined: Self = StObject.set(x, "BootstrapActions", js.undefined)
    
    inline def setBootstrapActionsVarargs(value: BootstrapActionDetail*): Self = StObject.set(x, "BootstrapActions", js.Array(value*))
    
    inline def setExecutionStatusDetail(value: JobFlowExecutionStatusDetail): Self = StObject.set(x, "ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: JobFlowInstancesDetail): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    inline def setJobFlowRole(value: XmlString): Self = StObject.set(x, "JobFlowRole", value.asInstanceOf[js.Any])
    
    inline def setJobFlowRoleUndefined: Self = StObject.set(x, "JobFlowRole", js.undefined)
    
    inline def setLogEncryptionKmsKeyId(value: XmlString): Self = StObject.set(x, "LogEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setLogEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "LogEncryptionKmsKeyId", js.undefined)
    
    inline def setLogUri(value: XmlString): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScaleDownBehavior(value: ScaleDownBehavior): Self = StObject.set(x, "ScaleDownBehavior", value.asInstanceOf[js.Any])
    
    inline def setScaleDownBehaviorUndefined: Self = StObject.set(x, "ScaleDownBehavior", js.undefined)
    
    inline def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setSteps(value: StepDetailList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: StepDetail*): Self = StObject.set(x, "Steps", js.Array(value*))
    
    inline def setSupportedProducts(value: SupportedProductsList): Self = StObject.set(x, "SupportedProducts", value.asInstanceOf[js.Any])
    
    inline def setSupportedProductsUndefined: Self = StObject.set(x, "SupportedProducts", js.undefined)
    
    inline def setSupportedProductsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "SupportedProducts", js.Array(value*))
    
    inline def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
    
    inline def setVisibleToAllUsersUndefined: Self = StObject.set(x, "VisibleToAllUsers", js.undefined)
  }
}
