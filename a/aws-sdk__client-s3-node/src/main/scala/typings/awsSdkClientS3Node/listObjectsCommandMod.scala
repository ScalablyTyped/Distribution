package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
import typings.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listObjectsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/ListObjectsCommand", "ListObjectsCommand")
  @js.native
  class ListObjectsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListObjectsInput, 
          OutputTypesUnion, 
          ListObjectsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectsInput) = this()
    
    /* CompleteClass */
    override val input: ListObjectsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  }
}
