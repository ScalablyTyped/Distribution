package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
import typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketWebsiteCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketWebsiteCommand", "PutBucketWebsiteCommand")
  @js.native
  open class PutBucketWebsiteCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketWebsiteInput, 
          OutputTypesUnion, 
          PutBucketWebsiteOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketWebsiteInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketWebsiteInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
  }
}
