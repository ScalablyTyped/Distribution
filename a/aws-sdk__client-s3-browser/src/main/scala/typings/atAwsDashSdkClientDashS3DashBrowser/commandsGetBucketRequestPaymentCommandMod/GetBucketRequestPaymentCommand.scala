package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketRequestPaymentCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketRequestPaymentCommand", "GetBucketRequestPaymentCommand")
@js.native
class GetBucketRequestPaymentCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketRequestPaymentInput, 
      OutputTypesUnion, 
      GetBucketRequestPaymentOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketRequestPaymentInput) = this()
  /* CompleteClass */
  override val input: GetBucketRequestPaymentInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
}

