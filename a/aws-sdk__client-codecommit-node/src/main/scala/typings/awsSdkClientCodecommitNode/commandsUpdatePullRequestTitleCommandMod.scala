package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdatePullRequestTitleCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestTitleCommand", "UpdatePullRequestTitleCommand")
  @js.native
  open class UpdatePullRequestTitleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdatePullRequestTitleInput, 
          OutputTypesUnion, 
          UpdatePullRequestTitleOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestTitleInput) = this()
    
    /* CompleteClass */
    override val input: UpdatePullRequestTitleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
  }
}
