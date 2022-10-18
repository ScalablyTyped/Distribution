package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
import typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBucketPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketPolicyCommand", "DeleteBucketPolicyCommand")
  @js.native
  open class DeleteBucketPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketPolicyInput, 
          OutputTypesUnion, 
          DeleteBucketPolicyOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketPolicyInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
  }
}
