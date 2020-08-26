package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsChannelCommand", JSImport.Namespace)
@js.native
object getApnsChannelCommandMod extends js.Object {
  @js.native
  class GetApnsChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetApnsChannelInput, 
          OutputTypesUnion, 
          GetApnsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApnsChannelInput) = this()
    val middlewareStack: MiddlewareStack[GetApnsChannelInput, GetApnsChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsChannelInput, GetApnsChannelOutput] = js.native
  }
  
}

