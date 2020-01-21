package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
import typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketTaggingCommand", JSImport.Namespace)
@js.native
object deleteBucketTaggingCommandMod extends js.Object {
  @js.native
  class DeleteBucketTaggingCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketTaggingInput, 
          OutputTypesUnion, 
          DeleteBucketTaggingOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketTaggingInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketTaggingInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketTaggingInput, DeleteBucketTaggingOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketTaggingInput, DeleteBucketTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketTaggingInput, DeleteBucketTaggingOutput] = js.native
  }
  
}

