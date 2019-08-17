package typings.atAwsDashSdkClientDashS3DashBrowser.commandsListObjectsCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListObjectsInputMod.ListObjectsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListObjectsOutputMod.ListObjectsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListObjectsCommand", "ListObjectsCommand")
@js.native
class ListObjectsCommand protected () extends Command[
      InputTypesUnion, 
      ListObjectsInput, 
      OutputTypesUnion, 
      ListObjectsOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListObjectsInput) = this()
  /* CompleteClass */
  override val input: ListObjectsInput = js.native
  val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
}

