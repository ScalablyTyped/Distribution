package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPostCommentReplyCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentReplyCommand", "PostCommentReplyCommand")
  @js.native
  open class PostCommentReplyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PostCommentReplyInput, 
          OutputTypesUnion, 
          PostCommentReplyOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentReplyInput) = this()
    
    /* CompleteClass */
    override val input: PostCommentReplyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PostCommentReplyInput, PostCommentReplyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
  }
}
