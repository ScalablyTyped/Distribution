package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketTaggingCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketTaggingCommand", "PutBucketTaggingCommand")
@js.native
class PutBucketTaggingCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketTaggingInput, 
      OutputTypesUnion, 
      PutBucketTaggingOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketTaggingInput) = this()
  /* CompleteClass */
  override val input: PutBucketTaggingInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketTaggingInput, PutBucketTaggingOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
}

