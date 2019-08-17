package typings.atAwsDashSdkClientDashXrayDashNode.commandsGetSamplingStatisticSummariesCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
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

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingStatisticSummariesCommand", "GetSamplingStatisticSummariesCommand")
@js.native
class GetSamplingStatisticSummariesCommand protected () extends Command[
      InputTypesUnion, 
      GetSamplingStatisticSummariesInput, 
      OutputTypesUnion, 
      GetSamplingStatisticSummariesOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetSamplingStatisticSummariesInput) = this()
  /* CompleteClass */
  override val input: GetSamplingStatisticSummariesInput = js.native
  val middlewareStack: MiddlewareStack[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
}

