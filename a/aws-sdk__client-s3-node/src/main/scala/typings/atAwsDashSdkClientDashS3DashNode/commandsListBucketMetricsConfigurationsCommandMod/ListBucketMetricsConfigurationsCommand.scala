package typings.atAwsDashSdkClientDashS3DashNode.commandsListBucketMetricsConfigurationsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketMetricsConfigurationsCommand", "ListBucketMetricsConfigurationsCommand")
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
  /* CompleteClass */
  override val input: ListBucketMetricsConfigurationsInput = js.native
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
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
}

