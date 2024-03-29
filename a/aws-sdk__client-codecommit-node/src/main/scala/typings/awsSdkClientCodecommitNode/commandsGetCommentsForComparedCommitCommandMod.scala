package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
import typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCommentsForComparedCommitCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForComparedCommitCommand", "GetCommentsForComparedCommitCommand")
  @js.native
  open class GetCommentsForComparedCommitCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCommentsForComparedCommitInput, 
          OutputTypesUnion, 
          GetCommentsForComparedCommitOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetCommentsForComparedCommitInput) = this()
    
    /* CompleteClass */
    override val input: GetCommentsForComparedCommitInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
  }
}
