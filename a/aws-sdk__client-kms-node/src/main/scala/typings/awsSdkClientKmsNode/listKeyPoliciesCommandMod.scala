package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typings.awsSdkClientKmsNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", JSImport.Namespace)
@js.native
object listKeyPoliciesCommandMod extends js.Object {
  
  @js.native
  class ListKeyPoliciesCommand protected () extends Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
}
