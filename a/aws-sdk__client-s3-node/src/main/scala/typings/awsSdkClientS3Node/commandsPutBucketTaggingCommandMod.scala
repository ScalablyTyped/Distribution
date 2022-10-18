package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketTaggingCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketTaggingCommand", "PutBucketTaggingCommand")
  @js.native
  open class PutBucketTaggingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketTaggingInput, 
          OutputTypesUnion, 
          PutBucketTaggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketTaggingInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketTaggingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  }
}
