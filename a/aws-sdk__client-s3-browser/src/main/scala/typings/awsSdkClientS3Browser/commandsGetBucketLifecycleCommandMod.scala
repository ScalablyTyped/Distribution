package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
import typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketLifecycleCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLifecycleCommand", "GetBucketLifecycleCommand")
  @js.native
  open class GetBucketLifecycleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketLifecycleInput, 
          OutputTypesUnion, 
          GetBucketLifecycleOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketLifecycleInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketLifecycleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
  }
}
