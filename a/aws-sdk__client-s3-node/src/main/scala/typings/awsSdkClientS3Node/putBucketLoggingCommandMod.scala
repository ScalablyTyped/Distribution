package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typings.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLoggingCommand", JSImport.Namespace)
@js.native
object putBucketLoggingCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
  }
  
}

