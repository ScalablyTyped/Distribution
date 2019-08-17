package typings.atAwsDashSdkClientDashS3DashNode.commandsGetBucketRequestPaymentCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketRequestPaymentCommand", "GetBucketRequestPaymentCommand")
@js.native
class GetBucketRequestPaymentCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketRequestPaymentInput, 
      OutputTypesUnion, 
      GetBucketRequestPaymentOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetBucketRequestPaymentInput) = this()
  /* CompleteClass */
  override val input: GetBucketRequestPaymentInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
}

