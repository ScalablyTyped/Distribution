package typings.atAwsDashSdkClientDashXrayDashNode.commandsGetServiceGraphCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
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

@JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", "GetServiceGraphCommand")
@js.native
class GetServiceGraphCommand protected () extends Command[
      InputTypesUnion, 
      GetServiceGraphInput, 
      OutputTypesUnion, 
      GetServiceGraphOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetServiceGraphInput) = this()
  /* CompleteClass */
  override val input: GetServiceGraphInput = js.native
  val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
}

