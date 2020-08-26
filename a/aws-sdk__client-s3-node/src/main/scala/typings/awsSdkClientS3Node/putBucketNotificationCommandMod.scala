package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typings.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketNotificationCommand", JSImport.Namespace)
@js.native
object putBucketNotificationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationInput, 
          OutputTypesUnion, 
          PutBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketNotificationInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketNotificationInput, PutBucketNotificationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
  }
  
}

