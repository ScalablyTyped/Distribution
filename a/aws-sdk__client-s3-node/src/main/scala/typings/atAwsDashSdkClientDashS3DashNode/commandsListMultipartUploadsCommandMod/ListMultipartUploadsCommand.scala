package typings.atAwsDashSdkClientDashS3DashNode.commandsListMultipartUploadsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
@js.native
class ListMultipartUploadsCommand protected () extends Command[
      InputTypesUnion, 
      ListMultipartUploadsInput, 
      OutputTypesUnion, 
      ListMultipartUploadsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListMultipartUploadsInput) = this()
  /* CompleteClass */
  override val input: ListMultipartUploadsInput = js.native
  val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
}

