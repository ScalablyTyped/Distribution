package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteVaultAccessPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultAccessPolicyCommand", "DeleteVaultAccessPolicyCommand")
  @js.native
  open class DeleteVaultAccessPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteVaultAccessPolicyInput, 
          OutputTypesUnion, 
          DeleteVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DeleteVaultAccessPolicyInput) = this()
    
    /* CompleteClass */
    override val input: DeleteVaultAccessPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
  }
}
