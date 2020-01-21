package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketMetricsConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketMetricsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
  }
  
}

