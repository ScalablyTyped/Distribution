package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEventStreamCommand", JSImport.Namespace)
@js.native
object commandsDeleteEventStreamCommandMod extends js.Object {
  @js.native
  class DeleteEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventStreamInput, 
          OutputTypesUnion, 
          DeleteEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEventStreamInput) = this()
    /* CompleteClass */
    override val input: DeleteEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEventStreamInput, DeleteEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
  }
  
}

