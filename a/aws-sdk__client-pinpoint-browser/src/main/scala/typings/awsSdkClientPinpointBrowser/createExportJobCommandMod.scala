package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateExportJobCommand", JSImport.Namespace)
@js.native
object createExportJobCommandMod extends js.Object {
  @js.native
  class CreateExportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateExportJobInput, 
          OutputTypesUnion, 
          CreateExportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateExportJobInput) = this()
    val middlewareStack: MiddlewareStack[CreateExportJobInput, CreateExportJobOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
  }
  
}

