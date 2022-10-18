package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointCommand", "UpdateEndpointCommand")
  @js.native
  open class UpdateEndpointCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateEndpointInput, 
          OutputTypesUnion, 
          UpdateEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateEndpointInput) = this()
    
    /* CompleteClass */
    override val input: UpdateEndpointInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateEndpointInput, UpdateEndpointOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
  }
}
