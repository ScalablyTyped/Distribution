package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
import typings.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketPolicyCommand", JSImport.Namespace)
@js.native
object putBucketPolicyCommandMod extends js.Object {
  
  @js.native
  class PutBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketPolicyInput, 
          OutputTypesUnion, 
          PutBucketPolicyOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketPolicyInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
  }
}
