package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketMetricsConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketMetricsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteBucketMetricsConfigurationInput, 
        DeleteBucketMetricsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
  }
  
}

