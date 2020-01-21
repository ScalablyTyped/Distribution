package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
import typings.awsSdkClientGlacierNode.typesDeleteVaultOutputMod.DeleteVaultOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultCommand", JSImport.Namespace)
@js.native
object deleteVaultCommandMod extends js.Object {
  @js.native
  class DeleteVaultCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultInput, 
          OutputTypesUnion, 
          DeleteVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultInput, DeleteVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
  }
  
}

