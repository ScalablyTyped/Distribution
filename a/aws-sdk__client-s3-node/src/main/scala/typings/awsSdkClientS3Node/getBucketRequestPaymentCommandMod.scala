package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketRequestPaymentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketRequestPaymentCommand", "GetBucketRequestPaymentCommand")
  @js.native
  open class GetBucketRequestPaymentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketRequestPaymentInput, 
          OutputTypesUnion, 
          GetBucketRequestPaymentOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketRequestPaymentInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketRequestPaymentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
  }
}
