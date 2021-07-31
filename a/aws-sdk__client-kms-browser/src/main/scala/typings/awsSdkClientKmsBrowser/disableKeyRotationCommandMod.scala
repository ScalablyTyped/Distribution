package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typings.awsSdkClientKmsBrowser.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
  @js.native
  class DisableKeyRotationCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
}
