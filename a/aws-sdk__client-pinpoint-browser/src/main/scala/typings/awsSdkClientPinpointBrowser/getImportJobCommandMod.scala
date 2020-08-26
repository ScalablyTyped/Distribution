package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
import typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", JSImport.Namespace)
@js.native
object getImportJobCommandMod extends js.Object {
  @js.native
  class GetImportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobInput, 
          OutputTypesUnion, 
          GetImportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetImportJobInput) = this()
    val middlewareStack: MiddlewareStack[GetImportJobInput, GetImportJobOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  }
  
}

