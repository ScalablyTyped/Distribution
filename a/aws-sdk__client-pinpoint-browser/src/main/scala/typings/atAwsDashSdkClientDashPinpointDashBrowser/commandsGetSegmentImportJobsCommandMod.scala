package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentImportJobsCommand", JSImport.Namespace)
@js.native
object commandsGetSegmentImportJobsCommandMod extends js.Object {
  @js.native
  class GetSegmentImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentImportJobsInput, 
          OutputTypesUnion, 
          GetSegmentImportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentImportJobsInput) = this()
    /* CompleteClass */
    override val input: GetSegmentImportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetSegmentImportJobsInput, GetSegmentImportJobsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
  }
  
}

