package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
import typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketPolicyCommand", "PutBucketPolicyCommand")
  @js.native
  open class PutBucketPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketPolicyInput, 
          OutputTypesUnion, 
          PutBucketPolicyOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketPolicyInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
  }
}
