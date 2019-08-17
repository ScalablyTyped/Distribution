package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketInventoryConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketInventoryConfigurationCommand", "DeleteBucketInventoryConfigurationCommand")
@js.native
class DeleteBucketInventoryConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketInventoryConfigurationInput, 
      OutputTypesUnion, 
      DeleteBucketInventoryConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketInventoryConfigurationInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketInventoryConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    DeleteBucketInventoryConfigurationInput, 
    DeleteBucketInventoryConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
}

