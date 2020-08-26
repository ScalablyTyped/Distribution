package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
import typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketCorsCommand", JSImport.Namespace)
@js.native
object deleteBucketCorsCommandMod extends js.Object {
  @js.native
  class DeleteBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketCorsInput, 
          OutputTypesUnion, 
          DeleteBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketCorsInput) = this()
    val middlewareStack: MiddlewareStack[DeleteBucketCorsInput, DeleteBucketCorsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketCorsInput, DeleteBucketCorsOutput] = js.native
  }
  
}

