package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetObjectCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetObjectInputMod.GetObjectInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetObjectOutputMod.GetObjectOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetObjectCommand", "GetObjectCommand")
@js.native
class GetObjectCommand protected () extends Command[
      InputTypesUnion, 
      GetObjectInput, 
      OutputTypesUnion, 
      GetObjectOutput[Blob], 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetObjectInput) = this()
  /* CompleteClass */
  override val input: GetObjectInput = js.native
  val middlewareStack: MiddlewareStack[GetObjectInput, GetObjectOutput[Blob], Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
}

