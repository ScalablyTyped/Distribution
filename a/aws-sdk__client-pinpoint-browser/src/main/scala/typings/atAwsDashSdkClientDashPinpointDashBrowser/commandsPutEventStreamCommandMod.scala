package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPutEventStreamInputMod.PutEventStreamInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventStreamCommand", JSImport.Namespace)
@js.native
object commandsPutEventStreamCommandMod extends js.Object {
  @js.native
  class PutEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          PutEventStreamInput, 
          OutputTypesUnion, 
          PutEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventStreamInput) = this()
    /* CompleteClass */
    override val input: PutEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[PutEventStreamInput, PutEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
  }
  
}

