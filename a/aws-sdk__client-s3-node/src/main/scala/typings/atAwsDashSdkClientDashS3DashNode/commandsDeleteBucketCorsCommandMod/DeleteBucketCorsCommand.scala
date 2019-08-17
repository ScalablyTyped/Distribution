package typings.atAwsDashSdkClientDashS3DashNode.commandsDeleteBucketCorsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketCorsCommand", "DeleteBucketCorsCommand")
@js.native
class DeleteBucketCorsCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBucketCorsInput, 
      OutputTypesUnion, 
      DeleteBucketCorsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBucketCorsInput) = this()
  /* CompleteClass */
  override val input: DeleteBucketCorsInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBucketCorsInput, DeleteBucketCorsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketCorsInput, DeleteBucketCorsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteBucketCorsInput, DeleteBucketCorsOutput] = js.native
}

