package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postCommentReplyCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentReplyCommand", "PostCommentReplyCommand")
  @js.native
  class PostCommentReplyCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentReplyInput, 
          OutputTypesUnion, 
          PostCommentReplyOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentReplyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
  }
}
