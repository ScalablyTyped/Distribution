package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketLoggingCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLoggingInputMod.GetBucketLoggingInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLoggingCommand", "GetBucketLoggingCommand")
@js.native
class GetBucketLoggingCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketLoggingInput, 
      OutputTypesUnion, 
      GetBucketLoggingOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketLoggingInput) = this()
  /* CompleteClass */
  override val input: GetBucketLoggingInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketLoggingInput, GetBucketLoggingOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLoggingInput, GetBucketLoggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLoggingInput, GetBucketLoggingOutput] = js.native
}

