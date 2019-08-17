package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketAccelerateConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAccelerateConfigurationCommand", "PutBucketAccelerateConfigurationCommand")
@js.native
class PutBucketAccelerateConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketAccelerateConfigurationInput, 
      OutputTypesUnion, 
      PutBucketAccelerateConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketAccelerateConfigurationInput) = this()
  /* CompleteClass */
  override val input: PutBucketAccelerateConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    PutBucketAccelerateConfigurationInput, 
    PutBucketAccelerateConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
}

