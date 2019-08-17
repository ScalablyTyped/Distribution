package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketEncryptionCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketEncryptionCommand", "DeleteBucketEncryptionCommand")
@js.native
class DeleteBucketEncryptionCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketEncryptionInput, 
      OutputTypesUnion, 
      DeleteBucketEncryptionOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketEncryptionInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketEncryptionInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
}

