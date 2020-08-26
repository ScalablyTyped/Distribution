package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
import typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/SelectObjectContentCommand", JSImport.Namespace)
@js.native
object selectObjectContentCommandMod extends js.Object {
  @js.native
  class SelectObjectContentCommand protected () extends Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: SelectObjectContentInput) = this()
    val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
  
}

