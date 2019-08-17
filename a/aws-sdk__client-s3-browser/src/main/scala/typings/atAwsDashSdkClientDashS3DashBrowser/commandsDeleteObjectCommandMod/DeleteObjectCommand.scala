package typings.atAwsDashSdkClientDashS3DashBrowser.commandsDeleteObjectCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteObjectInputMod.DeleteObjectInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteObjectOutputMod.DeleteObjectOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteObjectCommand", "DeleteObjectCommand")
@js.native
class DeleteObjectCommand protected () extends Command[
      InputTypesUnion, 
      DeleteObjectInput, 
      OutputTypesUnion, 
      DeleteObjectOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteObjectInput) = this()
  /* CompleteClass */
  override val input: DeleteObjectInput = js.native
  val middlewareStack: MiddlewareStack[DeleteObjectInput, DeleteObjectOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
}

