package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestStatusCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestStatusCommand", "UpdatePullRequestStatusCommand")
  @js.native
  class UpdatePullRequestStatusCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdatePullRequestStatusInput, 
          OutputTypesUnion, 
          UpdatePullRequestStatusOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestStatusInput) = this()
    
    /* CompleteClass */
    override val input: UpdatePullRequestStatusInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
  }
}
