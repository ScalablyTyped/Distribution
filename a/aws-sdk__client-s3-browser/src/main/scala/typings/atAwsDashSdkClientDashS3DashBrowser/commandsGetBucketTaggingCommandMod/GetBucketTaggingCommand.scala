package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketTaggingCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketTaggingInputMod.GetBucketTaggingInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketTaggingCommand", "GetBucketTaggingCommand")
@js.native
class GetBucketTaggingCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketTaggingInput, 
      OutputTypesUnion, 
      GetBucketTaggingOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketTaggingInput) = this()
  /* CompleteClass */
  override val input: GetBucketTaggingInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketTaggingInput, GetBucketTaggingOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
}

