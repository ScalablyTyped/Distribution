package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typings.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", JSImport.Namespace)
@js.native
object listTagsForVaultCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[ListTagsForVaultInput, ListTagsForVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  }
  
}

