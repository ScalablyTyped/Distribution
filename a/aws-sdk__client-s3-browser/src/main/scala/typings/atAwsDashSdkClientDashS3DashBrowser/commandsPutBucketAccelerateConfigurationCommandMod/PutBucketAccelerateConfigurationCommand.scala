package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketAccelerateConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAccelerateConfigurationCommand", "PutBucketAccelerateConfigurationCommand")
@js.native
class PutBucketAccelerateConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketAccelerateConfigurationInput, 
      OutputTypesUnion, 
      PutBucketAccelerateConfigurationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketAccelerateConfigurationInput) = this()
  /* CompleteClass */
  override val input: PutBucketAccelerateConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
}

