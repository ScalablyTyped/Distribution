package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
import typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketWebsiteCommand", JSImport.Namespace)
@js.native
object putBucketWebsiteCommandMod extends js.Object {
  @js.native
  class PutBucketWebsiteCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketWebsiteInput, 
          OutputTypesUnion, 
          PutBucketWebsiteOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketWebsiteInput) = this()
    /* CompleteClass */
    override val input: PutBucketWebsiteInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketWebsiteInput, PutBucketWebsiteOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
  }
  
}

