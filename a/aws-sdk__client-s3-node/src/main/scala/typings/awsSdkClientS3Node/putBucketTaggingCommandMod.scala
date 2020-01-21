package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketTaggingCommand", JSImport.Namespace)
@js.native
object putBucketTaggingCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  }
  
}

