package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketTaggingCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketTaggingCommand", "PutBucketTaggingCommand")
@js.native
class PutBucketTaggingCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketTaggingInput, 
      OutputTypesUnion, 
      PutBucketTaggingOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketTaggingInput) = this()
  /* CompleteClass */
  override val input: PutBucketTaggingInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketTaggingInput, PutBucketTaggingOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
}

