package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketLocationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLocationInputMod.GetBucketLocationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLocationOutputMod.GetBucketLocationOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLocationCommand", "GetBucketLocationCommand")
@js.native
class GetBucketLocationCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketLocationInput, 
      OutputTypesUnion, 
      GetBucketLocationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketLocationInput) = this()
  /* CompleteClass */
  override val input: GetBucketLocationInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketLocationInput, GetBucketLocationOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
}

