package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipSandboxChannelCommand", JSImport.Namespace)
@js.native
object commandsGetApnsVoipSandboxChannelCommandMod extends js.Object {
  @js.native
  class GetApnsVoipSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          GetApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApnsVoipSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: GetApnsVoipSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
  }
  
}

