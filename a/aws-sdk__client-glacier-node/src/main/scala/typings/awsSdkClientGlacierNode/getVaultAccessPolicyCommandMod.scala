package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object getVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class GetVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          GetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultAccessPolicyInput) = this()
    /* CompleteClass */
    override val input: GetVaultAccessPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
  }
  
}

