package typings.atAwsDashSdkClientDashS3DashNode.commandsCreateMultipartUploadCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
import typings.atAwsDashSdkClientDashS3DashNode.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CreateMultipartUploadCommand", "CreateMultipartUploadCommand")
@js.native
class CreateMultipartUploadCommand protected () extends Command[
      InputTypesUnion, 
      CreateMultipartUploadInput, 
      OutputTypesUnion, 
      CreateMultipartUploadOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateMultipartUploadInput) = this()
  /* CompleteClass */
  override val input: CreateMultipartUploadInput = js.native
  val middlewareStack: MiddlewareStack[CreateMultipartUploadInput, CreateMultipartUploadOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
}

