package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
import typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyObjectCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/CopyObjectCommand", "CopyObjectCommand")
  @js.native
  class CopyObjectCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CopyObjectInput, 
          OutputTypesUnion, 
          CopyObjectOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: CopyObjectInput) = this()
    
    /* CompleteClass */
    override val input: CopyObjectInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CopyObjectInput, CopyObjectOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
  }
}
