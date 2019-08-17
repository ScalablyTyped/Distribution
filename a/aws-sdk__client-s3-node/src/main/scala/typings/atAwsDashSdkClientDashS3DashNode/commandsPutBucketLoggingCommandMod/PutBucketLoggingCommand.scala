package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketLoggingCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLoggingCommand", "PutBucketLoggingCommand")
@js.native
class PutBucketLoggingCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketLoggingInput, 
      OutputTypesUnion, 
      PutBucketLoggingOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketLoggingInput) = this()
  /* CompleteClass */
  override val input: PutBucketLoggingInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketLoggingInput, PutBucketLoggingOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
}

