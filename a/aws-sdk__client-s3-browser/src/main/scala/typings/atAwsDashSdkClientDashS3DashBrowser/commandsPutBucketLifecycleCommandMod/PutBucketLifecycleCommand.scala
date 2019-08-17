package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketLifecycleCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketLifecycleCommand", "PutBucketLifecycleCommand")
@js.native
class PutBucketLifecycleCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketLifecycleInput, 
      OutputTypesUnion, 
      PutBucketLifecycleOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketLifecycleInput) = this()
  /* CompleteClass */
  override val input: PutBucketLifecycleInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketLifecycleInput, PutBucketLifecycleOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
}

