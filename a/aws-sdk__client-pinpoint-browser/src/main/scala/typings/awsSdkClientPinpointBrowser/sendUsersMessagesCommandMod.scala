package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendUsersMessagesCommand", JSImport.Namespace)
@js.native
object sendUsersMessagesCommandMod extends js.Object {
  @js.native
  class SendUsersMessagesCommand protected () extends Command[
          InputTypesUnion, 
          SendUsersMessagesInput, 
          OutputTypesUnion, 
          SendUsersMessagesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: SendUsersMessagesInput) = this()
    val middlewareStack: MiddlewareStack[SendUsersMessagesInput, SendUsersMessagesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
  }
  
}

