package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSegmentCommand", JSImport.Namespace)
@js.native
object commandsUpdateSegmentCommandMod extends js.Object {
  @js.native
  class UpdateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSegmentInput, 
          OutputTypesUnion, 
          UpdateSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateSegmentInput) = this()
    /* CompleteClass */
    override val input: UpdateSegmentInput = js.native
    val middlewareStack: MiddlewareStack[UpdateSegmentInput, UpdateSegmentOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
  }
  
}

