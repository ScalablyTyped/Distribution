package typings.atAwsDashSdkClientDashS3DashBrowser.commandsListMultipartUploadsCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
@js.native
class ListMultipartUploadsCommand protected () extends Command[
      InputTypesUnion, 
      ListMultipartUploadsInput, 
      OutputTypesUnion, 
      ListMultipartUploadsOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListMultipartUploadsInput) = this()
  /* CompleteClass */
  override val input: ListMultipartUploadsInput = js.native
  val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
}

