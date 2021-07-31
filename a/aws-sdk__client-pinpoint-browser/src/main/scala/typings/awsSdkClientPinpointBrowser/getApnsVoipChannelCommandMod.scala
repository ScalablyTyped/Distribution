package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApnsVoipChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipChannelCommand", "GetApnsVoipChannelCommand")
  @js.native
  class GetApnsVoipChannelCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
  }
}
