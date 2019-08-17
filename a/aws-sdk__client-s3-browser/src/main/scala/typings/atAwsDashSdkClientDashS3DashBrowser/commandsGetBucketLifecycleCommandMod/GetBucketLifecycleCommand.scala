package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketLifecycleCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLifecycleCommand", "GetBucketLifecycleCommand")
@js.native
class GetBucketLifecycleCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketLifecycleInput, 
      OutputTypesUnion, 
      GetBucketLifecycleOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketLifecycleInput) = this()
  /* CompleteClass */
  override val input: GetBucketLifecycleInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketLifecycleInput, GetBucketLifecycleOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
}

