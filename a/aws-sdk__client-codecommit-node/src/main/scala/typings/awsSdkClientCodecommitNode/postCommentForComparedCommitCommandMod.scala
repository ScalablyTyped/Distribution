package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postCommentForComparedCommitCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForComparedCommitCommand", "PostCommentForComparedCommitCommand")
  @js.native
  class PostCommentForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForComparedCommitInput, 
          OutputTypesUnion, 
          PostCommentForComparedCommitOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentForComparedCommitInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
  }
}
