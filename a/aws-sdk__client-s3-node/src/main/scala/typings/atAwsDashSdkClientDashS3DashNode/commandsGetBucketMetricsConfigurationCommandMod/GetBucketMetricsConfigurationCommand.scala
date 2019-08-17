package typings.atAwsDashSdkClientDashS3DashNode.commandsGetBucketMetricsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketMetricsConfigurationCommand", "GetBucketMetricsConfigurationCommand")
@js.native
class GetBucketMetricsConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketMetricsConfigurationInput, 
      OutputTypesUnion, 
      GetBucketMetricsConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetBucketMetricsConfigurationInput) = this()
  /* CompleteClass */
  override val input: GetBucketMetricsConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
}

