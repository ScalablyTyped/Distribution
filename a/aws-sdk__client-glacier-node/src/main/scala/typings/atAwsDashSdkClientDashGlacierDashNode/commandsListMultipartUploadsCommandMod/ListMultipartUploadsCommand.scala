package typings.atAwsDashSdkClientDashGlacierDashNode.commandsListMultipartUploadsCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
@js.native
class ListMultipartUploadsCommand protected () extends Command[
      InputTypesUnion, 
      ListMultipartUploadsInput, 
      OutputTypesUnion, 
      ListMultipartUploadsOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListMultipartUploadsInput) = this()
  /* CompleteClass */
  override val input: ListMultipartUploadsInput = js.native
  val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
}

