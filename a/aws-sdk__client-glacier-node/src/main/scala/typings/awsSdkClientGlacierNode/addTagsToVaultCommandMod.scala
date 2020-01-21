package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typings.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AddTagsToVaultCommand", JSImport.Namespace)
@js.native
object addTagsToVaultCommandMod extends js.Object {
  @js.native
  class AddTagsToVaultCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToVaultInput, 
          OutputTypesUnion, 
          AddTagsToVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddTagsToVaultInput) = this()
    /* CompleteClass */
    override val input: AddTagsToVaultInput = js.native
    val middlewareStack: MiddlewareStack[AddTagsToVaultInput, AddTagsToVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  }
  
}

