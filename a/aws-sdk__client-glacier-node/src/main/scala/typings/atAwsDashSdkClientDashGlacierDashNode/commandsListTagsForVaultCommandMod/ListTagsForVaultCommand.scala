package typings.atAwsDashSdkClientDashGlacierDashNode.commandsListTagsForVaultCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", "ListTagsForVaultCommand")
@js.native
class ListTagsForVaultCommand protected () extends Command[
      InputTypesUnion, 
      ListTagsForVaultInput, 
      OutputTypesUnion, 
      ListTagsForVaultOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListTagsForVaultInput) = this()
  /* CompleteClass */
  override val input: ListTagsForVaultInput = js.native
  val middlewareStack: MiddlewareStack[ListTagsForVaultInput, ListTagsForVaultOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
}

