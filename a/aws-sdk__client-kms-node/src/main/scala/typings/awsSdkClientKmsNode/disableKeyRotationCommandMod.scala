package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typings.awsSdkClientKmsNode.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
  @js.native
  open class DisableKeyRotationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DisableKeyRotationInput, 
          OutputTypesUnion, 
          DisableKeyRotationOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DisableKeyRotationInput) = this()
    
    /* CompleteClass */
    override val input: DisableKeyRotationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
}
