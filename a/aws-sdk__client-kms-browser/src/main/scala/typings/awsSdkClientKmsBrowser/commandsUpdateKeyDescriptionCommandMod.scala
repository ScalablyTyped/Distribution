package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateKeyDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
  @js.native
  open class UpdateKeyDescriptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    
    /* CompleteClass */
    override val input: UpdateKeyDescriptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
}
