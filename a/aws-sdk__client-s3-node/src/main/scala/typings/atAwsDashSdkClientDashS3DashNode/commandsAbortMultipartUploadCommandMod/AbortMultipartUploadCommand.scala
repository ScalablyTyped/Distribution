package typings.atAwsDashSdkClientDashS3DashNode.commandsAbortMultipartUploadCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typings.atAwsDashSdkClientDashS3DashNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/AbortMultipartUploadCommand", "AbortMultipartUploadCommand")
@js.native
class AbortMultipartUploadCommand protected () extends Command[
      InputTypesUnion, 
      AbortMultipartUploadInput, 
      OutputTypesUnion, 
      AbortMultipartUploadOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: AbortMultipartUploadInput) = this()
  /* CompleteClass */
  override val input: AbortMultipartUploadInput = js.native
  val middlewareStack: MiddlewareStack[AbortMultipartUploadInput, AbortMultipartUploadOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
}

