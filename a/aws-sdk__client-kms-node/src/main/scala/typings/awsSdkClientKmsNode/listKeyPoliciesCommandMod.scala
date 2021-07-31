package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typings.awsSdkClientKmsNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listKeyPoliciesCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
  @js.native
  class ListKeyPoliciesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    
    /* CompleteClass */
    override val input: ListKeyPoliciesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
}
