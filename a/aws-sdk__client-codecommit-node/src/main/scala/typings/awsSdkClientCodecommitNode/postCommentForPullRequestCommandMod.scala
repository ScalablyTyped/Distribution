package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForPullRequestCommand", JSImport.Namespace)
@js.native
object postCommentForPullRequestCommandMod extends js.Object {
  @js.native
  class PostCommentForPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForPullRequestInput, 
          OutputTypesUnion, 
          PostCommentForPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentForPullRequestInput) = this()
    val middlewareStack: MiddlewareStack[PostCommentForPullRequestInput, PostCommentForPullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
  }
  
}

