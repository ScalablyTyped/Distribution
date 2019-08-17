package typings.atAwsDashSdkClientDashS3DashNode.commandsListObjectVersionsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectVersionsCommand", "ListObjectVersionsCommand")
@js.native
class ListObjectVersionsCommand protected () extends Command[
      InputTypesUnion, 
      ListObjectVersionsInput, 
      OutputTypesUnion, 
      ListObjectVersionsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListObjectVersionsInput) = this()
  /* CompleteClass */
  override val input: ListObjectVersionsInput = js.native
  val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
}

