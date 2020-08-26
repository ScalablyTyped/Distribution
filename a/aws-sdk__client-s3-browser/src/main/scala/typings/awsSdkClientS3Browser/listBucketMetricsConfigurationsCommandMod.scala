package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListBucketMetricsConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketMetricsConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketMetricsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketMetricsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketMetricsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListBucketMetricsConfigurationsInput) = this()
    val middlewareStack: MiddlewareStack[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
  }
  
}

