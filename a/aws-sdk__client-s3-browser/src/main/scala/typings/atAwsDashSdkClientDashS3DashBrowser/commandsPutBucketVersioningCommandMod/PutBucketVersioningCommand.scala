package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketVersioningCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketVersioningCommand", "PutBucketVersioningCommand")
@js.native
class PutBucketVersioningCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketVersioningInput, 
      OutputTypesUnion, 
      PutBucketVersioningOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketVersioningInput) = this()
  /* CompleteClass */
  override val input: PutBucketVersioningInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
}

