package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBucketAnalyticsConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketAnalyticsConfigurationCommand", "DeleteBucketAnalyticsConfigurationCommand")
  @js.native
  open class DeleteBucketAnalyticsConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketAnalyticsConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketAnalyticsConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
  }
}
