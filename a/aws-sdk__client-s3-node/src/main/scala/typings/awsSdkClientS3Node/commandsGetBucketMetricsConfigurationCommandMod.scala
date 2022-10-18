package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketMetricsConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketMetricsConfigurationCommand", "GetBucketMetricsConfigurationCommand")
  @js.native
  open class GetBucketMetricsConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketMetricsConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketMetricsConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
  }
}
