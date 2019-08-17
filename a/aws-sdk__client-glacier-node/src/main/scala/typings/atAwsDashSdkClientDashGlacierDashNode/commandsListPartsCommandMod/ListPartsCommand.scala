package typings.atAwsDashSdkClientDashGlacierDashNode.commandsListPartsCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListPartsInputMod.ListPartsInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListPartsOutputMod.ListPartsOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListPartsCommand", "ListPartsCommand")
@js.native
class ListPartsCommand protected () extends Command[
      InputTypesUnion, 
      ListPartsInput, 
      OutputTypesUnion, 
      ListPartsOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListPartsInput) = this()
  /* CompleteClass */
  override val input: ListPartsInput = js.native
  val middlewareStack: MiddlewareStack[ListPartsInput, ListPartsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListPartsInput, ListPartsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListPartsInput, ListPartsOutput] = js.native
}

