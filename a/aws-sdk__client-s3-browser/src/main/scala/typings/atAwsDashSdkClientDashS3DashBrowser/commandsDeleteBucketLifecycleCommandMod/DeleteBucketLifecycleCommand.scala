package typings.atAwsDashSdkClientDashS3DashBrowser.commandsDeleteBucketLifecycleCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketLifecycleCommand", "DeleteBucketLifecycleCommand")
@js.native
class DeleteBucketLifecycleCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketLifecycleInput, 
      OutputTypesUnion, 
      DeleteBucketLifecycleOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBucketLifecycleInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketLifecycleInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
}

