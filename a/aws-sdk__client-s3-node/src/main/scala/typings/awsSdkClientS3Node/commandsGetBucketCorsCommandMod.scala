package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput
import typings.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketCorsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketCorsCommand", "GetBucketCorsCommand")
  @js.native
  open class GetBucketCorsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketCorsInput, 
          OutputTypesUnion, 
          GetBucketCorsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketCorsInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketCorsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketCorsInput, GetBucketCorsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
  }
}
