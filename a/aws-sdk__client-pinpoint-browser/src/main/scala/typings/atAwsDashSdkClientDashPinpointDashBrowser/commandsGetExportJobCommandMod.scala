package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobInputMod.GetExportJobInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobOutputMod.GetExportJobOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobCommand", JSImport.Namespace)
@js.native
object commandsGetExportJobCommandMod extends js.Object {
  @js.native
  class GetExportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetExportJobInput, 
          OutputTypesUnion, 
          GetExportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetExportJobInput) = this()
    /* CompleteClass */
    override val input: GetExportJobInput = js.native
    val middlewareStack: MiddlewareStack[GetExportJobInput, GetExportJobOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
  }
  
}

