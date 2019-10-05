package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForComparedCommitCommand", JSImport.Namespace)
@js.native
object commandsPostCommentForComparedCommitCommandMod extends js.Object {
  @js.native
  class PostCommentForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForComparedCommitInput, 
          OutputTypesUnion, 
          PostCommentForComparedCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentForComparedCommitInput) = this()
    /* CompleteClass */
    override val input: PostCommentForComparedCommitInput = js.native
    val middlewareStack: MiddlewareStack[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
  }
  
}

