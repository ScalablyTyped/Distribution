package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typings.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketLoggingCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketLoggingCommand", "PutBucketLoggingCommand")
  @js.native
  open class PutBucketLoggingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketLoggingInput, 
          OutputTypesUnion, 
          PutBucketLoggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketLoggingInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketLoggingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
  }
}
