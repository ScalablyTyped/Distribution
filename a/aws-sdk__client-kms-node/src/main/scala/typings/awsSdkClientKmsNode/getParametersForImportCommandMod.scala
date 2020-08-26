package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
import typings.awsSdkClientKmsNode.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GetParametersForImportCommand", JSImport.Namespace)
@js.native
object getParametersForImportCommandMod extends js.Object {
  @js.native
  class GetParametersForImportCommand protected () extends Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetParametersForImportInput) = this()
    val middlewareStack: MiddlewareStack[GetParametersForImportInput, GetParametersForImportOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
  
}

