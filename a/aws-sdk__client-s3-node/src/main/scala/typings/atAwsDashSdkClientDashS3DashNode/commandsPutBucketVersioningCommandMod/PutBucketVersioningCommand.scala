package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketVersioningCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketVersioningCommand", "PutBucketVersioningCommand")
@js.native
class PutBucketVersioningCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketVersioningInput, 
      OutputTypesUnion, 
      PutBucketVersioningOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketVersioningInput) = this()
  /* CompleteClass */
  override val input: PutBucketVersioningInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
}

