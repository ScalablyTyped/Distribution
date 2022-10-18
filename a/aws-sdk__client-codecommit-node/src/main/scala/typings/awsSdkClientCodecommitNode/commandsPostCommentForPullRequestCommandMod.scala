package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPostCommentForPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForPullRequestCommand", "PostCommentForPullRequestCommand")
  @js.native
  open class PostCommentForPullRequestCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
  }
}
