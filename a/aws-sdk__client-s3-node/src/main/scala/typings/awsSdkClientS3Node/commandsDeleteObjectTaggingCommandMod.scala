package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
import typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteObjectTaggingCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/DeleteObjectTaggingCommand", "DeleteObjectTaggingCommand")
  @js.native
  open class DeleteObjectTaggingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteObjectTaggingInput, 
          OutputTypesUnion, 
          DeleteObjectTaggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteObjectTaggingInput) = this()
    
    /* CompleteClass */
    override val input: DeleteObjectTaggingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteObjectTaggingInput, DeleteObjectTaggingOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectTaggingInput, DeleteObjectTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteObjectTaggingInput, DeleteObjectTaggingOutput] = js.native
  }
}
