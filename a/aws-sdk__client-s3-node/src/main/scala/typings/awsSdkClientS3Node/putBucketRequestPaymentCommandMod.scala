package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typings.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketRequestPaymentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketRequestPaymentCommand", "PutBucketRequestPaymentCommand")
  @js.native
  class PutBucketRequestPaymentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketRequestPaymentInput, 
          OutputTypesUnion, 
          PutBucketRequestPaymentOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketRequestPaymentInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketRequestPaymentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  }
}
