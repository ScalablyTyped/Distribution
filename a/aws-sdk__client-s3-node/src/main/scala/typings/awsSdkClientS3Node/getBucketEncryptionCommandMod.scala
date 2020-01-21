package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
import typings.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketEncryptionCommand", JSImport.Namespace)
@js.native
object getBucketEncryptionCommandMod extends js.Object {
  @js.native
  class GetBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketEncryptionInput, 
          OutputTypesUnion, 
          GetBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketEncryptionInput) = this()
    /* CompleteClass */
    override val input: GetBucketEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketEncryptionInput, GetBucketEncryptionOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
  }
  
}

