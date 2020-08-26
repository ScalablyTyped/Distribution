package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketLifecycleCommand", JSImport.Namespace)
@js.native
object deleteBucketLifecycleCommandMod extends js.Object {
  @js.native
  class DeleteBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketLifecycleInput, 
          OutputTypesUnion, 
          DeleteBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketLifecycleInput) = this()
    val middlewareStack: MiddlewareStack[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  }
  
}

