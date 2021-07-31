package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendUsersMessagesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/SendUsersMessagesCommand", "SendUsersMessagesCommand")
  @js.native
  class SendUsersMessagesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SendUsersMessagesInput, 
          OutputTypesUnion, 
          SendUsersMessagesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: SendUsersMessagesInput) = this()
    
    /* CompleteClass */
    override val input: SendUsersMessagesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
  }
}
