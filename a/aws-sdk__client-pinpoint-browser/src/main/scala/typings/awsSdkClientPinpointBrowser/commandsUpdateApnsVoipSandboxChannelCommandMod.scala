package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateApnsVoipSandboxChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipSandboxChannelCommand", "UpdateApnsVoipSandboxChannelCommand")
  @js.native
  open class UpdateApnsVoipSandboxChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateApnsVoipSandboxChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateApnsVoipSandboxChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
  }
}
