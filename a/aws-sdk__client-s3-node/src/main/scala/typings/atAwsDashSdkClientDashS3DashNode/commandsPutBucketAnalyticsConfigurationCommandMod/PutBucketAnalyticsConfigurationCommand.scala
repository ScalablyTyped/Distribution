package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketAnalyticsConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAnalyticsConfigurationCommand", "PutBucketAnalyticsConfigurationCommand")
@js.native
class PutBucketAnalyticsConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketAnalyticsConfigurationInput, 
      OutputTypesUnion, 
      PutBucketAnalyticsConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketAnalyticsConfigurationInput) = this()
  /* CompleteClass */
  override val input: PutBucketAnalyticsConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    PutBucketAnalyticsConfigurationInput, 
    PutBucketAnalyticsConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
}

