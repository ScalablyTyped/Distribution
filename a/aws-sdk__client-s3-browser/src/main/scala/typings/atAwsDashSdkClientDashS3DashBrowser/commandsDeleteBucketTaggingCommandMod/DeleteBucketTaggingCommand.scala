package typings.atAwsDashSdkClientDashS3DashBrowser.commandsDeleteBucketTaggingCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketTaggingCommand", "DeleteBucketTaggingCommand")
@js.native
class DeleteBucketTaggingCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketTaggingInput, 
      OutputTypesUnion, 
      DeleteBucketTaggingOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBucketTaggingInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketTaggingInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketTaggingInput, DeleteBucketTaggingOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketTaggingInput, DeleteBucketTaggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketTaggingInput, DeleteBucketTaggingOutput] = js.native
}

