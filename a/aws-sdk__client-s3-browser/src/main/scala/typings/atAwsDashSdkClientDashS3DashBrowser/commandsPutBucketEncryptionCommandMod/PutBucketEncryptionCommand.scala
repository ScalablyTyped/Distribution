package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketEncryptionCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketEncryptionCommand", "PutBucketEncryptionCommand")
@js.native
class PutBucketEncryptionCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketEncryptionInput, 
      OutputTypesUnion, 
      PutBucketEncryptionOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketEncryptionInput) = this()
  /* CompleteClass */
  override val input: PutBucketEncryptionInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketEncryptionInput, PutBucketEncryptionOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
}

