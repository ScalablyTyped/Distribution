package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput
import typings.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketTaggingCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketTaggingCommand", "GetBucketTaggingCommand")
  @js.native
  open class GetBucketTaggingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketTaggingInput, 
          OutputTypesUnion, 
          GetBucketTaggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketTaggingInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketTaggingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
  }
}
