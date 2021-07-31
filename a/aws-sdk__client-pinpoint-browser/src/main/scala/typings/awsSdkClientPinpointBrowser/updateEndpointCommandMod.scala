package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointCommand", "UpdateEndpointCommand")
  @js.native
  class UpdateEndpointCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
  }
}
