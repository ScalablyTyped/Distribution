package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEmailChannelCommand", JSImport.Namespace)
@js.native
object commandsUpdateEmailChannelCommandMod extends js.Object {
  @js.native
  class UpdateEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEmailChannelInput, 
          OutputTypesUnion, 
          UpdateEmailChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEmailChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateEmailChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateEmailChannelInput, UpdateEmailChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEmailChannelInput, UpdateEmailChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEmailChannelInput, UpdateEmailChannelOutput] = js.native
  }
  
}

