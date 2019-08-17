package typings.atAwsDashSdkClientDashS3DashNode.commandsListObjectsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectsInputMod.ListObjectsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectsOutputMod.ListObjectsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectsCommand", "ListObjectsCommand")
@js.native
class ListObjectsCommand protected () extends Command[
      InputTypesUnion, 
      ListObjectsInput, 
      OutputTypesUnion, 
      ListObjectsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListObjectsInput) = this()
  /* CompleteClass */
  override val input: ListObjectsInput = js.native
  val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
}

