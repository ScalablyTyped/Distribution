package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
import typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateCommentCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateCommentCommand", "UpdateCommentCommand")
  @js.native
  open class UpdateCommentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateCommentInput, 
          OutputTypesUnion, 
          UpdateCommentOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateCommentInput) = this()
    
    /* CompleteClass */
    override val input: UpdateCommentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateCommentInput, UpdateCommentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
  }
}
