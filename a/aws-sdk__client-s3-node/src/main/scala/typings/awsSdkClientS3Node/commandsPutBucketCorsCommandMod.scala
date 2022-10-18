package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
import typings.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketCorsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketCorsCommand", "PutBucketCorsCommand")
  @js.native
  open class PutBucketCorsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketCorsInput, 
          OutputTypesUnion, 
          PutBucketCorsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketCorsInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketCorsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketCorsInput, PutBucketCorsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
  }
}
