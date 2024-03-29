package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput
import typings.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCommentCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentCommand", "GetCommentCommand")
  @js.native
  open class GetCommentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCommentInput, 
          OutputTypesUnion, 
          GetCommentOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetCommentInput) = this()
    
    /* CompleteClass */
    override val input: GetCommentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCommentInput, GetCommentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentInput, GetCommentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetCommentInput, GetCommentOutput] = js.native
  }
}
