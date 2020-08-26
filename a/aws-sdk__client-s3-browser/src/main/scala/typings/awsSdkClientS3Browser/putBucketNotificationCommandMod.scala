package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketNotificationCommand", JSImport.Namespace)
@js.native
object putBucketNotificationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationInput, 
          OutputTypesUnion, 
          PutBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketNotificationInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketNotificationInput, PutBucketNotificationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
  }
  
}

