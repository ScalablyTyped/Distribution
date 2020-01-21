package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object deleteVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class DeleteVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultAccessPolicyInput, 
          OutputTypesUnion, 
          DeleteVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultAccessPolicyInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultAccessPolicyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
  }
  
}

