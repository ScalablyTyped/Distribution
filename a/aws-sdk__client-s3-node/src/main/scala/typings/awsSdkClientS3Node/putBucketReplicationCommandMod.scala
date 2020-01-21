package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketReplicationCommand", JSImport.Namespace)
@js.native
object putBucketReplicationCommandMod extends js.Object {
  @js.native
  class PutBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketReplicationInput, 
          OutputTypesUnion, 
          PutBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: PutBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketReplicationInput, PutBucketReplicationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  }
  
}

