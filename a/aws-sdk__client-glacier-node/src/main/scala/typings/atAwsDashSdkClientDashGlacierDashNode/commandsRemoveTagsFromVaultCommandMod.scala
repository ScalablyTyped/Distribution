package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/RemoveTagsFromVaultCommand", JSImport.Namespace)
@js.native
object commandsRemoveTagsFromVaultCommandMod extends js.Object {
  @js.native
  class RemoveTagsFromVaultCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromVaultInput, 
          OutputTypesUnion, 
          RemoveTagsFromVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemoveTagsFromVaultInput) = this()
    /* CompleteClass */
    override val input: RemoveTagsFromVaultInput = js.native
    val middlewareStack: MiddlewareStack[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
  }
  
}

