package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
import typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketReplicationCommand", JSImport.Namespace)
@js.native
object deleteBucketReplicationCommandMod extends js.Object {
  @js.native
  class DeleteBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketReplicationInput, 
          OutputTypesUnion, 
          DeleteBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketReplicationInput) = this()
    val middlewareStack: MiddlewareStack[DeleteBucketReplicationInput, DeleteBucketReplicationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketReplicationInput, DeleteBucketReplicationOutput] = js.native
  }
  
}

