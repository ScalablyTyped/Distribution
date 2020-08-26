package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
import typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketMetricsConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
  }
  
}

