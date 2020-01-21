package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
import typings.awsSdkClientKmsBrowser.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GetParametersForImportCommand", JSImport.Namespace)
@js.native
object getParametersForImportCommandMod extends js.Object {
  @js.native
  class GetParametersForImportCommand protected () extends Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetParametersForImportInput) = this()
    /* CompleteClass */
    override val input: GetParametersForImportInput = js.native
    val middlewareStack: MiddlewareStack[GetParametersForImportInput, GetParametersForImportOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
  
}

