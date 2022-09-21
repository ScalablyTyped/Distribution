package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typings.awsSdkClientKmsBrowser.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/EnableKeyRotationCommand", "EnableKeyRotationCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
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
