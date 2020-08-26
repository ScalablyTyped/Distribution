package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentExportJobsCommand", JSImport.Namespace)
@js.native
object getSegmentExportJobsCommandMod extends js.Object {
  @js.native
  class GetSegmentExportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentExportJobsInput, 
          OutputTypesUnion, 
          GetSegmentExportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentExportJobsInput) = this()
    val middlewareStack: MiddlewareStack[GetSegmentExportJobsInput, GetSegmentExportJobsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentExportJobsInput, GetSegmentExportJobsOutput] = js.native
  }
  
}

