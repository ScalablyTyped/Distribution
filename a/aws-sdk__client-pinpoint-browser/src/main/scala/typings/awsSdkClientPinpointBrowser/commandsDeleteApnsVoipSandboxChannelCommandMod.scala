package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteApnsVoipSandboxChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipSandboxChannelCommand", "DeleteApnsVoipSandboxChannelCommand")
  @js.native
  open class DeleteApnsVoipSandboxChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          DeleteApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteApnsVoipSandboxChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteApnsVoipSandboxChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
  }
}
