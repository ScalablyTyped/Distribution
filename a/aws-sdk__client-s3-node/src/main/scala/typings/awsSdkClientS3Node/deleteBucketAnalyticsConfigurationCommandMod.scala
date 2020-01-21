package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteBucketAnalyticsConfigurationInput, 
        DeleteBucketAnalyticsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

