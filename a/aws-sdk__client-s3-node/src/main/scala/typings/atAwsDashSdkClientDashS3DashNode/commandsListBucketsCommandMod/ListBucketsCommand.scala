package typings.atAwsDashSdkClientDashS3DashNode.commandsListBucketsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketsInputMod.ListBucketsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketsOutputMod.ListBucketsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketsCommand", "ListBucketsCommand")
@js.native
class ListBucketsCommand protected () extends Command[
      InputTypesUnion, 
      ListBucketsInput, 
      OutputTypesUnion, 
      ListBucketsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListBucketsInput) = this()
  /* CompleteClass */
  override val input: ListBucketsInput = js.native
  val middlewareStack: MiddlewareStack[ListBucketsInput, ListBucketsOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
}

