package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
import typings.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBucketEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketEncryptionCommand", "DeleteBucketEncryptionCommand")
  @js.native
  open class DeleteBucketEncryptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketEncryptionInput, 
          OutputTypesUnion, 
          DeleteBucketEncryptionOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketEncryptionInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketEncryptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
  }
}
