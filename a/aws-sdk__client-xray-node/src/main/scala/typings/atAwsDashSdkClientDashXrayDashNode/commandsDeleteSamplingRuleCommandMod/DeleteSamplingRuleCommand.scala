package typings.atAwsDashSdkClientDashXrayDashNode.commandsDeleteSamplingRuleCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", "DeleteSamplingRuleCommand")
@js.native
class DeleteSamplingRuleCommand protected () extends Command[
      InputTypesUnion, 
      DeleteSamplingRuleInput, 
      OutputTypesUnion, 
      DeleteSamplingRuleOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteSamplingRuleInput) = this()
  /* CompleteClass */
  override val input: DeleteSamplingRuleInput = js.native
  val middlewareStack: MiddlewareStack[DeleteSamplingRuleInput, DeleteSamplingRuleOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
}

