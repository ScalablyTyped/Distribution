package typings.atAwsDashSdkClientDashGlacierDashNode.commandsGetJobOutputCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetJobOutputInputMod.GetJobOutputInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetJobOutputCommand", "GetJobOutputCommand")
@js.native
class GetJobOutputCommand protected () extends Command[
      InputTypesUnion, 
      GetJobOutputInput, 
      OutputTypesUnion, 
      GetJobOutputOutput[Readable], 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetJobOutputInput) = this()
  /* CompleteClass */
  override val input: GetJobOutputInput = js.native
  val middlewareStack: MiddlewareStack[GetJobOutputInput, GetJobOutputOutput[Readable], Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
}

