package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEventStreamInputMod.GetEventStreamInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEventStreamCommand", JSImport.Namespace)
@js.native
object commandsGetEventStreamCommandMod extends js.Object {
  @js.native
  class GetEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          GetEventStreamInput, 
          OutputTypesUnion, 
          GetEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetEventStreamInput) = this()
    /* CompleteClass */
    override val input: GetEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[GetEventStreamInput, GetEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
  }
  
}

