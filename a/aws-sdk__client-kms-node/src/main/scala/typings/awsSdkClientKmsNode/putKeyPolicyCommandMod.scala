package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typings.awsSdkClientKmsNode.typesPutKeyPolicyOutputMod.PutKeyPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putKeyPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/PutKeyPolicyCommand", "PutKeyPolicyCommand")
  @js.native
  open class PutKeyPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutKeyPolicyInput, 
          OutputTypesUnion, 
          PutKeyPolicyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: PutKeyPolicyInput) = this()
    
    /* CompleteClass */
    override val input: PutKeyPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
  }
}
