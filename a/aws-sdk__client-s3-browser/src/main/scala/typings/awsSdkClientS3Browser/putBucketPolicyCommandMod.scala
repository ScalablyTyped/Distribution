package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
import typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketPolicyCommand", JSImport.Namespace)
@js.native
object putBucketPolicyCommandMod extends js.Object {
  @js.native
  class PutBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketPolicyInput, 
          OutputTypesUnion, 
          PutBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketPolicyInput) = this()
    /* CompleteClass */
    override val input: PutBucketPolicyInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketPolicyInput, PutBucketPolicyOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
  }
  
}

