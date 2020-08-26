package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
import typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobCommand", JSImport.Namespace)
@js.native
object getExportJobCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[GetExportJobInput, GetExportJobOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
  }
  
}

