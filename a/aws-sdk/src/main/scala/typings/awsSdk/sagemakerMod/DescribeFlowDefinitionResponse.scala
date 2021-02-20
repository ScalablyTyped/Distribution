package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowDefinitionResponse extends StObject {
  
  /**
    * The timestamp when the flow definition was created.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The reason your flow definition failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the flow defintion.
    */
  var FlowDefinitionArn: typings.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  
  /**
    * The status of the flow definition. Valid values are listed below.
    */
  var FlowDefinitionStatus: typings.awsSdk.sagemakerMod.FlowDefinitionStatus = js.native
  
  /**
    * An object containing information about what triggers a human review workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typings.awsSdk.sagemakerMod.HumanLoopActivationConfig] = js.native
  
  /**
    * An object containing information about who works on the task, the workforce task price, and other task details.
    */
  var HumanLoopConfig: typings.awsSdk.sagemakerMod.HumanLoopConfig = js.native
  
  /**
    * Container for configuring the source of human task requests. Used to specify if Amazon Rekognition or Amazon Textract is used as an integration source.
    */
  var HumanLoopRequestSource: js.UndefOr[typings.awsSdk.sagemakerMod.HumanLoopRequestSource] = js.native
  
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow definition.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
}
object DescribeFlowDefinitionResponse {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): DescribeFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionResponse]
  }
  
  @scala.inline
  implicit class DescribeFlowDefinitionResponseMutableBuilder[Self <: DescribeFlowDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDefinitionStatus(value: FlowDefinitionStatus): Self = StObject.set(x, "FlowDefinitionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationConfig(value: HumanLoopActivationConfig): Self = StObject.set(x, "HumanLoopActivationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationConfigUndefined: Self = StObject.set(x, "HumanLoopActivationConfig", js.undefined)
    
    @scala.inline
    def setHumanLoopConfig(value: HumanLoopConfig): Self = StObject.set(x, "HumanLoopConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopRequestSource(value: HumanLoopRequestSource): Self = StObject.set(x, "HumanLoopRequestSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopRequestSourceUndefined: Self = StObject.set(x, "HumanLoopRequestSource", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: FlowDefinitionOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
