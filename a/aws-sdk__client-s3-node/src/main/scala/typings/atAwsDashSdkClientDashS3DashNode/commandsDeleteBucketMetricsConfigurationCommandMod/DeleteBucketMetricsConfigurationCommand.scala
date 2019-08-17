package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketMetricsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketMetricsConfigurationCommand", "DeleteBucketMetricsConfigurationCommand")
@js.native
class DeleteBucketMetricsConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketMetricsConfigurationInput, 
      OutputTypesUnion, 
      DeleteBucketMetricsConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketMetricsConfigurationInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketMetricsConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    DeleteBucketMetricsConfigurationInput, 
    DeleteBucketMetricsConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
}

