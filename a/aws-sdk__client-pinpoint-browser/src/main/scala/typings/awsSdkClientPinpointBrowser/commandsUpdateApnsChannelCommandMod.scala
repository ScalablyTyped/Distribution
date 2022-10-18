package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateApnsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsChannelCommand", "UpdateApnsChannelCommand")
  @js.native
  open class UpdateApnsChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateApnsChannelInput, 
          OutputTypesUnion, 
          UpdateApnsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateApnsChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateApnsChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
  }
}
