package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteBucketAnalyticsConfigurationInput, 
        DeleteBucketAnalyticsConfigurationOutput, 
        Blob
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

