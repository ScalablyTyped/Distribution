package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteBucketLifecycleCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketLifecycleCommand", "DeleteBucketLifecycleCommand")
  @js.native
  class DeleteBucketLifecycleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketLifecycleInput, 
          OutputTypesUnion, 
          DeleteBucketLifecycleOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketLifecycleInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketLifecycleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  }
}
