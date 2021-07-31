package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postCommentForPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForPullRequestCommand", "PostCommentForPullRequestCommand")
  @js.native
  class PostCommentForPullRequestCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PostCommentForPullRequestInput, 
          OutputTypesUnion, 
          PostCommentForPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentForPullRequestInput) = this()
    
    /* CompleteClass */
    override val input: PostCommentForPullRequestInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
  }
}
