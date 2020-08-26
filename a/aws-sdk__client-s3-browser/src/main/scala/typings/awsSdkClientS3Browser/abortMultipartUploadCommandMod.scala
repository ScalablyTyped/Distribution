package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/AbortMultipartUploadCommand", JSImport.Namespace)
@js.native
object abortMultipartUploadCommandMod extends js.Object {
  @js.native
  class AbortMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          AbortMultipartUploadInput, 
          OutputTypesUnion, 
          AbortMultipartUploadOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: AbortMultipartUploadInput) = this()
    val middlewareStack: MiddlewareStack[AbortMultipartUploadInput, AbortMultipartUploadOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  }
  
}

