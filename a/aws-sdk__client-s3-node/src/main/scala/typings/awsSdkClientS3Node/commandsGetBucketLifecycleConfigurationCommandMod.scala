package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketLifecycleConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketLifecycleConfigurationCommand", "GetBucketLifecycleConfigurationCommand")
  @js.native
  open class GetBucketLifecycleConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          GetBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketLifecycleConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketLifecycleConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
  }
}
