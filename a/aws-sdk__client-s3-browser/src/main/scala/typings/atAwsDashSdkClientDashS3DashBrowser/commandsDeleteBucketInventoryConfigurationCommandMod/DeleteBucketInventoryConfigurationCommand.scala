package typings.atAwsDashSdkClientDashS3DashBrowser.commandsDeleteBucketInventoryConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketInventoryConfigurationCommand", "DeleteBucketInventoryConfigurationCommand")
@js.native
class DeleteBucketInventoryConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketInventoryConfigurationInput, 
      OutputTypesUnion, 
      DeleteBucketInventoryConfigurationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBucketInventoryConfigurationInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketInventoryConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    DeleteBucketInventoryConfigurationInput, 
    DeleteBucketInventoryConfigurationOutput, 
    Blob
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
}

