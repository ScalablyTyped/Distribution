package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typings.awsSdkClientKmsNode.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getKeyPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GetKeyPolicyCommand", "GetKeyPolicyCommand")
  @js.native
  open class GetKeyPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetKeyPolicyInput, 
          OutputTypesUnion, 
          GetKeyPolicyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetKeyPolicyInput) = this()
    
    /* CompleteClass */
    override val input: GetKeyPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
}
