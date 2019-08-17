package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketRequestPaymentCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketRequestPaymentCommand", "PutBucketRequestPaymentCommand")
@js.native
class PutBucketRequestPaymentCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketRequestPaymentInput, 
      OutputTypesUnion, 
      PutBucketRequestPaymentOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketRequestPaymentInput) = this()
  /* CompleteClass */
  override val input: PutBucketRequestPaymentInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
}

