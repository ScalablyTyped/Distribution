package typings.atAwsDashSdkClientDashS3DashBrowser.commandsGetBucketInventoryConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketInventoryConfigurationCommand", "GetBucketInventoryConfigurationCommand")
@js.native
class GetBucketInventoryConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      GetBucketInventoryConfigurationInput, 
      OutputTypesUnion, 
      GetBucketInventoryConfigurationOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetBucketInventoryConfigurationInput) = this()
  /* CompleteClass */
  override val input: GetBucketInventoryConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[GetBucketInventoryConfigurationInput, GetBucketInventoryConfigurationOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketInventoryConfigurationInput, GetBucketInventoryConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[GetBucketInventoryConfigurationInput, GetBucketInventoryConfigurationOutput] = js.native
}

