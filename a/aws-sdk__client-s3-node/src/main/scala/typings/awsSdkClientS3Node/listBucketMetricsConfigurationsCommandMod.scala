package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketMetricsConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketMetricsConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketMetricsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketMetricsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketMetricsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketMetricsConfigurationsInput) = this()
    val middlewareStack: MiddlewareStack[
        ListBucketMetricsConfigurationsInput, 
        ListBucketMetricsConfigurationsOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
  }
  
}

