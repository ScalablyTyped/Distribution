package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketAnalyticsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAnalyticsConfigurationCommand", "PutBucketAnalyticsConfigurationCommand")
@js.native
class PutBucketAnalyticsConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketAnalyticsConfigurationInput, 
      OutputTypesUnion, 
      PutBucketAnalyticsConfigurationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketAnalyticsConfigurationInput) = this()
  /* CompleteClass */
  override val input: PutBucketAnalyticsConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
}

