package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteGcmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteGcmChannelCommand", "DeleteGcmChannelCommand")
  @js.native
  open class DeleteGcmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteGcmChannelInput, 
          OutputTypesUnion, 
          DeleteGcmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteGcmChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteGcmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
  }
}
