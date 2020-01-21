package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketEncryptionCommand", JSImport.Namespace)
@js.native
object putBucketEncryptionCommandMod extends js.Object {
  @js.native
  class PutBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketEncryptionInput, 
          OutputTypesUnion, 
          PutBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketEncryptionInput) = this()
    /* CompleteClass */
    override val input: PutBucketEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketEncryptionInput, PutBucketEncryptionOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
  }
  
}

