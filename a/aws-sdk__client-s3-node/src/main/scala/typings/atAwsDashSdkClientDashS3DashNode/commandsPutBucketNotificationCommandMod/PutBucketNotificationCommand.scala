package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketNotificationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketNotificationCommand", "PutBucketNotificationCommand")
@js.native
class PutBucketNotificationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketNotificationInput, 
      OutputTypesUnion, 
      PutBucketNotificationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketNotificationInput) = this()
  /* CompleteClass */
  override val input: PutBucketNotificationInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketNotificationInput, PutBucketNotificationOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
}

