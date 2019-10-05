package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteGcmChannelCommand", JSImport.Namespace)
@js.native
object commandsDeleteGcmChannelCommandMod extends js.Object {
  @js.native
  class DeleteGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteGcmChannelInput, 
          OutputTypesUnion, 
          DeleteGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteGcmChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteGcmChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteGcmChannelInput, DeleteGcmChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
  }
  
}

