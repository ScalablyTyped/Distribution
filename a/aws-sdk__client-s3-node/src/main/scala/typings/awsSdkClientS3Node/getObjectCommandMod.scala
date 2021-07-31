package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
import typings.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getObjectCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetObjectCommand", "GetObjectCommand")
  @js.native
  class GetObjectCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetObjectInput, 
          OutputTypesUnion, 
          GetObjectOutput[Readable], 
          S3ResolvedConfiguration
        ] {
    def this(input: GetObjectInput) = this()
    
    /* CompleteClass */
    override val input: GetObjectInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetObjectInput, GetObjectOutput[Readable]] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectInput, GetObjectOutput[Readable]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[GetObjectInput, GetObjectOutput[Readable]] = js.native
  }
}
