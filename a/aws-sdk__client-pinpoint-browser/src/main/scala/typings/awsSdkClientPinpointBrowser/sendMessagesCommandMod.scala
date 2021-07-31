package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
import typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessagesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/SendMessagesCommand", "SendMessagesCommand")
  @js.native
  class SendMessagesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SendMessagesInput, 
          OutputTypesUnion, 
          SendMessagesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: SendMessagesInput) = this()
    
    /* CompleteClass */
    override val input: SendMessagesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SendMessagesInput, SendMessagesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[SendMessagesInput, SendMessagesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[SendMessagesInput, SendMessagesOutput] = js.native
  }
}
