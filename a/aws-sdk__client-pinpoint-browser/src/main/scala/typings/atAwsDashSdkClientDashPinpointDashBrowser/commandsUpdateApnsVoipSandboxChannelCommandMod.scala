package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipSandboxChannelCommand", JSImport.Namespace)
@js.native
object commandsUpdateApnsVoipSandboxChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsVoipSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsVoipSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateApnsVoipSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
  }
  
}

