package typings.atAwsDashSdkClientDashXrayDashNode.commandsGetTraceGraphCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
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

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceGraphCommand", "GetTraceGraphCommand")
@js.native
class GetTraceGraphCommand protected () extends Command[
      InputTypesUnion, 
      GetTraceGraphInput, 
      OutputTypesUnion, 
      GetTraceGraphOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetTraceGraphInput) = this()
  /* CompleteClass */
  override val input: GetTraceGraphInput = js.native
  val middlewareStack: MiddlewareStack[GetTraceGraphInput, GetTraceGraphOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
}

