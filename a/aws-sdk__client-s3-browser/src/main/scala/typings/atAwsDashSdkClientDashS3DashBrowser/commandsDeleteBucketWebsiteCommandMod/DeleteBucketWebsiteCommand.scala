package typings.atAwsDashSdkClientDashS3DashBrowser.commandsDeleteBucketWebsiteCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketWebsiteCommand", "DeleteBucketWebsiteCommand")
@js.native
class DeleteBucketWebsiteCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketWebsiteInput, 
      OutputTypesUnion, 
      DeleteBucketWebsiteOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBucketWebsiteInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketWebsiteInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketWebsiteInput, DeleteBucketWebsiteOutput] = js.native
}

