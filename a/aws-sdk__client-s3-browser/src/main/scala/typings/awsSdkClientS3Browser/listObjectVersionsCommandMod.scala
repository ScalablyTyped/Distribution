package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListObjectVersionsCommand", JSImport.Namespace)
@js.native
object listObjectVersionsCommandMod extends js.Object {
  @js.native
  class ListObjectVersionsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListObjectVersionsInput) = this()
    val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
  
}

