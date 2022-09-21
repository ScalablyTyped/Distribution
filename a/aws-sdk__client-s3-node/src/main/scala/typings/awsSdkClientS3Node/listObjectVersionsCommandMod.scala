package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typings.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listObjectVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/ListObjectVersionsCommand", "ListObjectVersionsCommand")
  @js.native
  open class ListObjectVersionsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectVersionsInput) = this()
    
    /* CompleteClass */
    override val input: ListObjectVersionsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
}
