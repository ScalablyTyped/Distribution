package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
import typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendMessagesCommand", JSImport.Namespace)
@js.native
object sendMessagesCommandMod extends js.Object {
  
  @js.native
  class SendMessagesCommand protected () extends Command[
          InputTypesUnion, 
          SendMessagesInput, 
          OutputTypesUnion, 
          SendMessagesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: SendMessagesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[SendMessagesInput, SendMessagesOutput] = js.native
  }
}
