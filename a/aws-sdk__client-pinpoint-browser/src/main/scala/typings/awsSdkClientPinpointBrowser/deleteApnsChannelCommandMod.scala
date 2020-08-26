package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsChannelCommand", JSImport.Namespace)
@js.native
object deleteApnsChannelCommandMod extends js.Object {
  @js.native
  class DeleteApnsChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsChannelInput, 
          OutputTypesUnion, 
          DeleteApnsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsChannelInput) = this()
    val middlewareStack: MiddlewareStack[DeleteApnsChannelInput, DeleteApnsChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsChannelInput, DeleteApnsChannelOutput] = js.native
  }
  
}

