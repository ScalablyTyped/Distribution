package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionDeclaration extends js.Object {
  
  /**
    * Specifies the action type and the provider of the action.
    */
  var actionTypeId: ActionTypeId = js.native
  
  /**
    * The action's configuration. These are key-value pairs that specify input values for an action. For more information, see Action Structure Requirements in CodePipeline. For the list of configuration properties for the AWS CloudFormation action type in CodePipeline, see Configuration Properties Reference in the AWS CloudFormation User Guide. For template snippets with examples, see Using Parameter Override Functions with CodePipeline Pipelines in the AWS CloudFormation User Guide. The values can be represented in either JSON or YAML format. For example, the JSON configuration item format is as follows:   JSON:   "Configuration" : { Key : Value }, 
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  
  /**
    * The name or ID of the artifact consumed by the action, such as a test or build artifact.
    */
  var inputArtifacts: js.UndefOr[InputArtifactList] = js.native
  
  /**
    * The action declaration's name.
    */
  var name: ActionName = js.native
  
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  
  /**
    * The name or ID of the result of the action declaration, such as a test or build artifact.
    */
  var outputArtifacts: js.UndefOr[OutputArtifactList] = js.native
  
  /**
    * The action declaration's AWS Region, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[ActionRunOrder] = js.native
}
object ActionDeclaration {
  
  @scala.inline
  def apply(actionTypeId: ActionTypeId, name: ActionName): ActionDeclaration = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDeclaration]
  }
  
  @scala.inline
  implicit class ActionDeclarationOps[Self <: ActionDeclaration] (val x: Self) extends AnyVal {
    
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
    def setActionTypeId(value: ActionTypeId): Self = this.set("actionTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ActionConfigurationMap): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setInputArtifactsVarargs(value: InputArtifact*): Self = this.set("inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifacts(value: InputArtifactList): Self = this.set("inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputArtifacts: Self = this.set("inputArtifacts", js.undefined)
    
    @scala.inline
    def setNamespace(value: ActionNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOutputArtifactsVarargs(value: OutputArtifact*): Self = this.set("outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: OutputArtifactList): Self = this.set("outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("outputArtifacts", js.undefined)
    
    @scala.inline
    def setRegion(value: AWSRegionName): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setRunOrder(value: ActionRunOrder): Self = this.set("runOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOrder: Self = this.set("runOrder", js.undefined)
  }
}
