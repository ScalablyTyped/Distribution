package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/RemoveTagsFromVaultCommand", JSImport.Namespace)
@js.native
object removeTagsFromVaultCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
  }
  
}

