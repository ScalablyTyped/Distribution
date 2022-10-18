package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetApnsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsChannelCommand", "GetApnsChannelCommand")
  @js.native
  open class GetApnsChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetApnsChannelInput, 
          OutputTypesUnion, 
          GetApnsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetApnsChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetApnsChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetApnsChannelInput, GetApnsChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsChannelInput, GetApnsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetApnsChannelInput, GetApnsChannelOutput] = js.native
  }
}
