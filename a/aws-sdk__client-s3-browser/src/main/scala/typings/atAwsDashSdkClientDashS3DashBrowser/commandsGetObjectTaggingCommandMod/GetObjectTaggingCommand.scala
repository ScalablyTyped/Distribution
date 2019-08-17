package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetObjectTaggingCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetObjectTaggingInputMod.GetObjectTaggingInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetObjectTaggingCommand", "GetObjectTaggingCommand")
@js.native
class GetObjectTaggingCommand protected () extends Command[
      InputTypesUnion, 
      GetObjectTaggingInput, 
      OutputTypesUnion, 
      GetObjectTaggingOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetObjectTaggingInput) = this()
  /* CompleteClass */
  override val input: GetObjectTaggingInput = js.native
  val middlewareStack: MiddlewareStack[GetObjectTaggingInput, GetObjectTaggingOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
}

