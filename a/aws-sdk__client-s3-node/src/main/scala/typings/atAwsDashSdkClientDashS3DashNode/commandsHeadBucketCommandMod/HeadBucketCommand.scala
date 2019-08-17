package typings.atAwsDashSdkClientDashS3DashNode.commandsHeadBucketCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesHeadBucketInputMod.HeadBucketInput
import typings.atAwsDashSdkClientDashS3DashNode.typesHeadBucketOutputMod.HeadBucketOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/HeadBucketCommand", "HeadBucketCommand")
@js.native
class HeadBucketCommand protected () extends Command[
      InputTypesUnion, 
      HeadBucketInput, 
      OutputTypesUnion, 
      HeadBucketOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: HeadBucketInput) = this()
  /* CompleteClass */
  override val input: HeadBucketInput = js.native
  val middlewareStack: MiddlewareStack[HeadBucketInput, HeadBucketOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
}

