package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketMetricsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketMetricsConfigurationCommand", "PutBucketMetricsConfigurationCommand")
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
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketMetricsConfigurationInput, PutBucketMetricsConfigurationOutput] = js.native
}

