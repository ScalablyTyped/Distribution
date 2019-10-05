package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipChannelCommand", JSImport.Namespace)
@js.native
object commandsDeleteApnsVoipChannelCommandMod extends js.Object {
  @js.native
  class DeleteApnsVoipChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsVoipChannelInput, 
          OutputTypesUnion, 
          DeleteApnsVoipChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsVoipChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteApnsVoipChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
  }
  
}

