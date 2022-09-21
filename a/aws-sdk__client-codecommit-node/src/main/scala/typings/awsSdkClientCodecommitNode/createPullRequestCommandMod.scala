package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
import typings.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/CreatePullRequestCommand", "CreatePullRequestCommand")
  @js.native
  open class CreatePullRequestCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreatePullRequestInput, 
          OutputTypesUnion, 
          CreatePullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreatePullRequestInput) = this()
    
    /* CompleteClass */
    override val input: CreatePullRequestInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreatePullRequestInput, CreatePullRequestOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreatePullRequestInput, CreatePullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[CreatePullRequestInput, CreatePullRequestOutput] = js.native
  }
}
