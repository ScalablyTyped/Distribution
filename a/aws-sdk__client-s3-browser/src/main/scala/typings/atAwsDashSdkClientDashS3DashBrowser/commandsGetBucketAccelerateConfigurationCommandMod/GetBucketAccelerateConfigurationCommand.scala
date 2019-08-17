package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketAccelerateConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketAccelerateConfigurationCommand", "GetBucketAccelerateConfigurationCommand")
@js.native
class GetBucketAccelerateConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketAccelerateConfigurationInput, 
      OutputTypesUnion, 
      GetBucketAccelerateConfigurationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketAccelerateConfigurationInput) = this()
  /* CompleteClass */
  override val input: GetBucketAccelerateConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput] = js.native
}

