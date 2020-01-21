package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
import typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobsCommand", JSImport.Namespace)
@js.native
object getImportJobsCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
  }
  
}

