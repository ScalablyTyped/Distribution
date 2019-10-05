package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsChannelCommand", JSImport.Namespace)
@js.native
object commandsGetApnsChannelCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: GetApnsChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetApnsChannelInput, GetApnsChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsChannelInput, GetApnsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsChannelInput, GetApnsChannelOutput] = js.native
  }
  
}

