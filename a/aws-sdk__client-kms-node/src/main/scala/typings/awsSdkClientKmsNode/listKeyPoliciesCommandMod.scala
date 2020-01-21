package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typings.awsSdkClientKmsNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", JSImport.Namespace)
@js.native
object listKeyPoliciesCommandMod extends js.Object {
  @js.native
  class ListKeyPoliciesCommand protected () extends Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    /* CompleteClass */
    override val input: ListKeyPoliciesInput = js.native
    val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
  
}

