package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
import typings.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", "GetPullRequestCommand")
  @js.native
  open class GetPullRequestCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetPullRequestInput, 
          OutputTypesUnion, 
          GetPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetPullRequestInput) = this()
    
    /* CompleteClass */
    override val input: GetPullRequestInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetPullRequestInput, GetPullRequestOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  }
}
