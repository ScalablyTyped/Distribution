package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
import typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          PutBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketMetricsConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketMetricsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketMetricsConfigurationInput, PutBucketMetricsConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketMetricsConfigurationInput, PutBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketMetricsConfigurationInput, PutBucketMetricsConfigurationOutput] = js.native
  }
  
}

