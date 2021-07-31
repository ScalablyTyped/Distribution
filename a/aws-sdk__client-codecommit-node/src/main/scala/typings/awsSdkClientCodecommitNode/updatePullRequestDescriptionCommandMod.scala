package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestDescriptionCommand", "UpdatePullRequestDescriptionCommand")
  @js.native
  class UpdatePullRequestDescriptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdatePullRequestDescriptionInput, 
          OutputTypesUnion, 
          UpdatePullRequestDescriptionOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestDescriptionInput) = this()
    
    /* CompleteClass */
    override val input: UpdatePullRequestDescriptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
  }
}
