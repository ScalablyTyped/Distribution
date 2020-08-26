package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typings.awsSdkClientKmsNode.typesPutKeyPolicyOutputMod.PutKeyPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/PutKeyPolicyCommand", JSImport.Namespace)
@js.native
object putKeyPolicyCommandMod extends js.Object {
  @js.native
  class PutKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          PutKeyPolicyInput, 
          OutputTypesUnion, 
          PutKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutKeyPolicyInput) = this()
    val middlewareStack: MiddlewareStack[PutKeyPolicyInput, PutKeyPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
  }
  
}

