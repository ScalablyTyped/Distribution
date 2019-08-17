package typings.atAwsDashSdkClientDashS3DashBrowser.commandsCreateBucketCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketInputMod.CreateBucketInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketOutputMod.CreateBucketOutput
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

@JSImport("@aws-sdk/client-s3-browser/commands/CreateBucketCommand", "CreateBucketCommand")
@js.native
class CreateBucketCommand protected () extends Command[
      InputTypesUnion, 
      CreateBucketInput, 
      OutputTypesUnion, 
      CreateBucketOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateBucketInput) = this()
  /* CompleteClass */
  override val input: CreateBucketInput = js.native
  val middlewareStack: MiddlewareStack[CreateBucketInput, CreateBucketOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
}

