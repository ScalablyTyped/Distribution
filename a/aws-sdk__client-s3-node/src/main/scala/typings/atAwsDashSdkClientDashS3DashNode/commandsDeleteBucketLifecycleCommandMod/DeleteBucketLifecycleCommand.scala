package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketLifecycleCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketLifecycleCommand", "DeleteBucketLifecycleCommand")
@js.native
class DeleteBucketLifecycleCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketLifecycleInput, 
      OutputTypesUnion, 
      DeleteBucketLifecycleOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketLifecycleInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketLifecycleInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
}

