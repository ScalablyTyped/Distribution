package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typings.awsSdkClientKmsBrowser.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getKeyPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GetKeyPolicyCommand", "GetKeyPolicyCommand")
  @js.native
  class GetKeyPolicyCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
}
