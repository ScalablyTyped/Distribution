package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetApnsVoipChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipChannelCommand", "GetApnsVoipChannelCommand")
  @js.native
  open class GetApnsVoipChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetApnsVoipChannelInput, 
          OutputTypesUnion, 
          GetApnsVoipChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetApnsVoipChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetApnsVoipChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
  }
}
