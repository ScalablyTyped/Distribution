package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateGcmChannelCommand", JSImport.Namespace)
@js.native
object updateGcmChannelCommandMod extends js.Object {
  @js.native
  class UpdateGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGcmChannelInput, 
          OutputTypesUnion, 
          UpdateGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateGcmChannelInput) = this()
    val middlewareStack: MiddlewareStack[UpdateGcmChannelInput, UpdateGcmChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
  }
  
}

