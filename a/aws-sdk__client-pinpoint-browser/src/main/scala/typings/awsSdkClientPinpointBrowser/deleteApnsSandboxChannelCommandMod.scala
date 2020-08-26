package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsSandboxChannelCommand", JSImport.Namespace)
@js.native
object deleteApnsSandboxChannelCommandMod extends js.Object {
  @js.native
  class DeleteApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsSandboxChannelInput, 
          OutputTypesUnion, 
          DeleteApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsSandboxChannelInput) = this()
    val middlewareStack: MiddlewareStack[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput] = js.native
  }
  
}

