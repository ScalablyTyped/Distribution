package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typings.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketEncryptionCommand", JSImport.Namespace)
@js.native
object putBucketEncryptionCommandMod extends js.Object {
  @js.native
  class PutBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketEncryptionInput, 
          OutputTypesUnion, 
          PutBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketEncryptionInput) = this()
    /* CompleteClass */
    override val input: PutBucketEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketEncryptionInput, PutBucketEncryptionOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
  }
  
}

