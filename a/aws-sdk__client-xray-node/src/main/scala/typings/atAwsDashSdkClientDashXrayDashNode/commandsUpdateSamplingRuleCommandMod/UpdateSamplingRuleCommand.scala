package typings.atAwsDashSdkClientDashXrayDashNode.commandsUpdateSamplingRuleCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/UpdateSamplingRuleCommand", "UpdateSamplingRuleCommand")
@js.native
class UpdateSamplingRuleCommand protected () extends Command[
      InputTypesUnion, 
      UpdateSamplingRuleInput, 
      OutputTypesUnion, 
      UpdateSamplingRuleOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateSamplingRuleInput) = this()
  /* CompleteClass */
  override val input: UpdateSamplingRuleInput = js.native
  val middlewareStack: MiddlewareStack[UpdateSamplingRuleInput, UpdateSamplingRuleOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
}

