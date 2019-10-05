package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAdmChannelCommand", JSImport.Namespace)
@js.native
object commandsDeleteAdmChannelCommandMod extends js.Object {
  @js.native
  class DeleteAdmChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAdmChannelInput, 
          OutputTypesUnion, 
          DeleteAdmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteAdmChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteAdmChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAdmChannelInput, DeleteAdmChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAdmChannelInput, DeleteAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAdmChannelInput, DeleteAdmChannelOutput] = js.native
  }
  
}

