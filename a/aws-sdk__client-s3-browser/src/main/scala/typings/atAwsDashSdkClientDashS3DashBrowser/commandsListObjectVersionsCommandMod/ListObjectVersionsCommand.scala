package typings.atAwsDashSdkClientDashS3DashBrowser.commandsListObjectVersionsCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListObjectVersionsCommand", "ListObjectVersionsCommand")
@js.native
class ListObjectVersionsCommand protected () extends Command[
      InputTypesUnion, 
      ListObjectVersionsInput, 
      OutputTypesUnion, 
      ListObjectVersionsOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListObjectVersionsInput) = this()
  /* CompleteClass */
  override val input: ListObjectVersionsInput = js.native
  val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
}

