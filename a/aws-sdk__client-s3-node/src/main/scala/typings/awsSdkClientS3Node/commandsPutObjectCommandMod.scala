package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutObjectCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutObjectCommand", "PutObjectCommand")
  @js.native
  open class PutObjectCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutObjectInput[Readable], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutObjectInput[Readable]) = this()
    
    /* CompleteClass */
    override val input: PutObjectInput[Readable] = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutObjectInput[Readable], PutObjectOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
  }
}
