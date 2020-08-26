package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
import typings.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketPolicyCommand", JSImport.Namespace)
@js.native
object getBucketPolicyCommandMod extends js.Object {
  @js.native
  class GetBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketPolicyInput, 
          OutputTypesUnion, 
          GetBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketPolicyInput) = this()
    val middlewareStack: MiddlewareStack[GetBucketPolicyInput, GetBucketPolicyOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketPolicyInput, GetBucketPolicyOutput] = js.native
  }
  
}

