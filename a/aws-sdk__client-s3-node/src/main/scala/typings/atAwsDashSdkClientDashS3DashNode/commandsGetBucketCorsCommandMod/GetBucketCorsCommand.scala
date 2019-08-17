package typings.atAwsDashSdkClientDashS3DashNode.commandsGetBucketCorsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketCorsInputMod.GetBucketCorsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketCorsOutputMod.GetBucketCorsOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketCorsCommand", "GetBucketCorsCommand")
@js.native
class GetBucketCorsCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketCorsInput, 
      OutputTypesUnion, 
      GetBucketCorsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetBucketCorsInput) = this()
  /* CompleteClass */
  override val input: GetBucketCorsInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketCorsInput, GetBucketCorsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
}

