package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetVaultAccessPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetVaultAccessPolicyCommand", "GetVaultAccessPolicyCommand")
  @js.native
  open class GetVaultAccessPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          GetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetVaultAccessPolicyInput) = this()
    
    /* CompleteClass */
    override val input: GetVaultAccessPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
  }
}
