package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPutEventsInputMod.PutEventsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPutEventsOutputMod.PutEventsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventsCommand", JSImport.Namespace)
@js.native
object commandsPutEventsCommandMod extends js.Object {
  @js.native
  class PutEventsCommand protected () extends Command[
          InputTypesUnion, 
          PutEventsInput, 
          OutputTypesUnion, 
          PutEventsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventsInput) = this()
    /* CompleteClass */
    override val input: PutEventsInput = js.native
    val middlewareStack: MiddlewareStack[PutEventsInput, PutEventsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
  }
  
}

