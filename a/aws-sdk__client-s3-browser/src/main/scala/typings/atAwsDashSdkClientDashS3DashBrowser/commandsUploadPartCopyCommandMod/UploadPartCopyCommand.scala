package typings.atAwsDashSdkClientDashS3DashBrowser.commandsUploadPartCopyCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUploadPartCopyInputMod.UploadPartCopyInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCopyCommand", "UploadPartCopyCommand")
@js.native
class UploadPartCopyCommand protected () extends Command[
      InputTypesUnion, 
      UploadPartCopyInput, 
      OutputTypesUnion, 
      UploadPartCopyOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: UploadPartCopyInput) = this()
  /* CompleteClass */
  override val input: UploadPartCopyInput = js.native
  val middlewareStack: MiddlewareStack[UploadPartCopyInput, UploadPartCopyOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
}

