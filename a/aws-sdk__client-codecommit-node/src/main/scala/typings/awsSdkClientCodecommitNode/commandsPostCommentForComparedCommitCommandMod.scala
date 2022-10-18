package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPostCommentForComparedCommitCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForComparedCommitCommand", "PostCommentForComparedCommitCommand")
  @js.native
  open class PostCommentForComparedCommitCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PostCommentForComparedCommitInput, 
          OutputTypesUnion, 
          PostCommentForComparedCommitOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentForComparedCommitInput) = this()
    
    /* CompleteClass */
    override val input: PostCommentForComparedCommitInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
  }
}
