package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput
import typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketPolicyCommand", JSImport.Namespace)
@js.native
object getBucketPolicyCommandMod extends js.Object {
  @js.native
  class GetBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketPolicyInput, 
          OutputTypesUnion, 
          GetBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketPolicyInput) = this()
    /* CompleteClass */
    override val input: GetBucketPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketPolicyInput, GetBucketPolicyOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketPolicyInput, GetBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketPolicyInput, GetBucketPolicyOutput] = js.native
  }
  
}

