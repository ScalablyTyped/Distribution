package typings.atAwsDashSdkClientDashS3DashBrowser.commandsListBucketMetricsConfigurationsCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListBucketMetricsConfigurationsCommand", "ListBucketMetricsConfigurationsCommand")
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
  /* CompleteClass */
  override val input: ListBucketMetricsConfigurationsInput = js.native
  val middlewareStack: MiddlewareStack[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
}

