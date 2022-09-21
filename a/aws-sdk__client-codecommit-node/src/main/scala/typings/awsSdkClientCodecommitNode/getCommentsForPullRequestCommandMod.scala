package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
import typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCommentsForPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForPullRequestCommand", "GetCommentsForPullRequestCommand")
  @js.native
  open class GetCommentsForPullRequestCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCommentsForPullRequestInput, 
          OutputTypesUnion, 
          GetCommentsForPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetCommentsForPullRequestInput) = this()
    
    /* CompleteClass */
    override val input: GetCommentsForPullRequestInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
  }
}
