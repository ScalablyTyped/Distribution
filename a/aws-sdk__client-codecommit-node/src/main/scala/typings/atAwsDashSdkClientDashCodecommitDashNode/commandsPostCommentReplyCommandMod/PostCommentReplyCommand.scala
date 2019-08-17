package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsPostCommentReplyCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyInputMod.PostCommentReplyInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentReplyCommand", "PostCommentReplyCommand")
@js.native
class PostCommentReplyCommand protected () extends Command[
      InputTypesUnion, 
      PostCommentReplyInput, 
      OutputTypesUnion, 
      PostCommentReplyOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: PostCommentReplyInput) = this()
  /* CompleteClass */
  override val input: PostCommentReplyInput = js.native
  val middlewareStack: MiddlewareStack[PostCommentReplyInput, PostCommentReplyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
}

