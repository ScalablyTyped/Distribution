package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteApnsVoipChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipChannelCommand", "DeleteApnsVoipChannelCommand")
  @js.native
  open class DeleteApnsVoipChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteApnsVoipChannelInput, 
          OutputTypesUnion, 
          DeleteApnsVoipChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteApnsVoipChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteApnsVoipChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
  }
}
