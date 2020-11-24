package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowDefinitionRequest extends js.Object {
  
  /**
    * The name of your flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  
  /**
    * An object containing information about the events that trigger a human workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typings.awsSdk.sagemakerMod.HumanLoopActivationConfig] = js.native
  
  /**
    * An object containing information about the tasks the human reviewers will perform.
    */
  var HumanLoopConfig: typings.awsSdk.sagemakerMod.HumanLoopConfig = js.native
  
  /**
    * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source.
    */
  var HumanLoopRequestSource: js.UndefOr[typings.awsSdk.sagemakerMod.HumanLoopRequestSource] = js.native
  
  /**
    * An object containing information about where the human review results will be uploaded.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example, arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateFlowDefinitionRequest {
  
  @scala.inline
  def apply(
    FlowDefinitionName: FlowDefinitionName,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): CreateFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionRequest]
  }
  
  @scala.inline
  implicit class CreateFlowDefinitionRequestOps[Self <: CreateFlowDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setFlowDefinitionName(value: FlowDefinitionName): Self = this.set("FlowDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopConfig(value: HumanLoopConfig): Self = this.set("HumanLoopConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfig(value: FlowDefinitionOutputConfig): Self = this.set("OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationConfig(value: HumanLoopActivationConfig): Self = this.set("HumanLoopActivationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLoopActivationConfig: Self = this.set("HumanLoopActivationConfig", js.undefined)
    
    @scala.inline
    def setHumanLoopRequestSource(value: HumanLoopRequestSource): Self = this.set("HumanLoopRequestSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLoopRequestSource: Self = this.set("HumanLoopRequestSource", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
