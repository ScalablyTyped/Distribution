package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsChannelCommand", JSImport.Namespace)
@js.native
object updateApnsChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsChannelInput, 
          OutputTypesUnion, 
          UpdateApnsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsChannelInput) = this()
    val middlewareStack: MiddlewareStack[UpdateApnsChannelInput, UpdateApnsChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
  }
  
}

