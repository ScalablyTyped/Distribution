package typings.atAwsDashSdkClientDashS3DashNode.commandsGetBucketAnalyticsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAnalyticsConfigurationCommand", "GetBucketAnalyticsConfigurationCommand")
@js.native
class GetBucketAnalyticsConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketAnalyticsConfigurationInput, 
      OutputTypesUnion, 
      GetBucketAnalyticsConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetBucketAnalyticsConfigurationInput) = this()
  /* CompleteClass */
  override val input: GetBucketAnalyticsConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    GetBucketAnalyticsConfigurationInput, 
    GetBucketAnalyticsConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
}

