package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketReplicationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketReplicationCommand", "PutBucketReplicationCommand")
@js.native
class PutBucketReplicationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketReplicationInput, 
      OutputTypesUnion, 
      PutBucketReplicationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketReplicationInput) = this()
  /* CompleteClass */
  override val input: PutBucketReplicationInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketReplicationInput, PutBucketReplicationOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
}

