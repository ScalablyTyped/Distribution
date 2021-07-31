package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApnsVoipSandboxChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipSandboxChannelCommand", "GetApnsVoipSandboxChannelCommand")
  @js.native
  class GetApnsVoipSandboxChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          GetApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetApnsVoipSandboxChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetApnsVoipSandboxChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
  }
}
