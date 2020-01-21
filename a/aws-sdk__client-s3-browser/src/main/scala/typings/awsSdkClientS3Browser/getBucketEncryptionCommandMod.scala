package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
import typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketEncryptionCommand", JSImport.Namespace)
@js.native
object getBucketEncryptionCommandMod extends js.Object {
  @js.native
  class GetBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketEncryptionInput, 
          OutputTypesUnion, 
          GetBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketEncryptionInput) = this()
    /* CompleteClass */
    override val input: GetBucketEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketEncryptionInput, GetBucketEncryptionOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
  }
  
}

