package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    actionTypeId: ActionTypeId,
    name: ActionName,
    configuration: ActionConfigurationMap = null,
    inputArtifacts: InputArtifactList = null,
    namespace: ActionNamespace = null,
    outputArtifacts: OutputArtifactList = null,
    region: AWSRegionName = null,
    roleArn: RoleArn = null,
    runOrder: Int | Double = null
  ): ActionDeclaration = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runOrder != null) __obj.updateDynamic("runOrder")(runOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDeclaration]
  }
}

