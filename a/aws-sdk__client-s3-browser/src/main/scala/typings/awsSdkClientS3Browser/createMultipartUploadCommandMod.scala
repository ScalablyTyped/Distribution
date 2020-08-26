package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
import typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/CreateMultipartUploadCommand", JSImport.Namespace)
@js.native
object createMultipartUploadCommandMod extends js.Object {
  @js.native
  class CreateMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CreateMultipartUploadInput, 
          OutputTypesUnion, 
          CreateMultipartUploadOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateMultipartUploadInput) = this()
    val middlewareStack: MiddlewareStack[CreateMultipartUploadInput, CreateMultipartUploadOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
  }
  
}

