package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typings.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPullRequestsCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", "ListPullRequestsCommand")
  @js.native
  class ListPullRequestsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListPullRequestsInput, 
          OutputTypesUnion, 
          ListPullRequestsOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListPullRequestsInput) = this()
    
    /* CompleteClass */
    override val input: ListPullRequestsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
}
