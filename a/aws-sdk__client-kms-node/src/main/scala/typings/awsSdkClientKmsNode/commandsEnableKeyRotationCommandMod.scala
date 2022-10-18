package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typings.awsSdkClientKmsNode.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsEnableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/EnableKeyRotationCommand", "EnableKeyRotationCommand")
  @js.native
  open class EnableKeyRotationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          EnableKeyRotationInput, 
          OutputTypesUnion, 
          EnableKeyRotationOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: EnableKeyRotationInput) = this()
    
    /* CompleteClass */
    override val input: EnableKeyRotationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
  }
}
