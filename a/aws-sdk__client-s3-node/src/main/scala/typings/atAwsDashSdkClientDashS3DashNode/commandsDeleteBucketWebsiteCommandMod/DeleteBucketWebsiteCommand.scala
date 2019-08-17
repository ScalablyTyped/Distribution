package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketWebsiteCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketWebsiteCommand", "DeleteBucketWebsiteCommand")
@js.native
class DeleteBucketWebsiteCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketWebsiteInput, 
      OutputTypesUnion, 
      DeleteBucketWebsiteOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketWebsiteInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketWebsiteInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput] = js.native
}

