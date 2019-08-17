package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutObjectCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutObjectInputMod.PutObjectInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutObjectOutputMod.PutObjectOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutObjectCommand", "PutObjectCommand")
@js.native
class PutObjectCommand protected () extends Command[
      InputTypesUnion, 
      PutObjectInput[Blob], 
      OutputTypesUnion, 
      PutObjectOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutObjectInput[Blob]) = this()
  /* CompleteClass */
  override val input: PutObjectInput[Blob] = js.native
  val middlewareStack: MiddlewareStack[PutObjectInput[Blob], PutObjectOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutObjectInput[Blob], PutObjectOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutObjectInput[Blob], PutObjectOutput] = js.native
}

