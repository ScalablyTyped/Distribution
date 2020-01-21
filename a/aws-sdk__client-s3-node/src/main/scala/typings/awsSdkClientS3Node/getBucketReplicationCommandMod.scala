package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
import typings.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketReplicationCommand", JSImport.Namespace)
@js.native
object getBucketReplicationCommandMod extends js.Object {
  @js.native
  class GetBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketReplicationInput, 
          OutputTypesUnion, 
          GetBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: GetBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketReplicationInput, GetBucketReplicationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
  }
  
}

