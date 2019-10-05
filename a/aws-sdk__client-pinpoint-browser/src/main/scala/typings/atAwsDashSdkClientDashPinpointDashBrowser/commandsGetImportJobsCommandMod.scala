package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetImportJobsInputMod.GetImportJobsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobsCommand", JSImport.Namespace)
@js.native
object commandsGetImportJobsCommandMod extends js.Object {
  @js.native
  class GetImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobsInput, 
          OutputTypesUnion, 
          GetImportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetImportJobsInput) = this()
    /* CompleteClass */
    override val input: GetImportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetImportJobsInput, GetImportJobsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
  }
  
}

