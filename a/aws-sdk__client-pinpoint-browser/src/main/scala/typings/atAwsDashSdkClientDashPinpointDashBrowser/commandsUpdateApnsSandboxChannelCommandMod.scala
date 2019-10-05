package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsSandboxChannelCommand", JSImport.Namespace)
@js.native
object commandsUpdateApnsSandboxChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateApnsSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
  }
  
}

