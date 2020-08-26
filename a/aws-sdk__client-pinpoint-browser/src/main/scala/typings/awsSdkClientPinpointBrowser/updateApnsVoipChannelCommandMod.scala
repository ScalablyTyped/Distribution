package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipChannelCommand", JSImport.Namespace)
@js.native
object updateApnsVoipChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsVoipChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsVoipChannelInput, 
          OutputTypesUnion, 
          UpdateApnsVoipChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsVoipChannelInput) = this()
    val middlewareStack: MiddlewareStack[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput] = js.native
  }
  
}

