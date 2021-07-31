package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteCommentContentCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteCommentContentCommand", "DeleteCommentContentCommand")
  @js.native
  class DeleteCommentContentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteCommentContentInput, 
          OutputTypesUnion, 
          DeleteCommentContentOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteCommentContentInput) = this()
    
    /* CompleteClass */
    override val input: DeleteCommentContentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
  }
}
