package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typings.awsSdkClientGlacierNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setVaultAccessPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/SetVaultAccessPolicyCommand", "SetVaultAccessPolicyCommand")
  @js.native
  open class SetVaultAccessPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          SetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: SetVaultAccessPolicyInput) = this()
    
    /* CompleteClass */
    override val input: SetVaultAccessPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
  }
}
