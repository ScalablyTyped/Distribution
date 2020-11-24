package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
import typings.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", JSImport.Namespace)
@js.native
object getPullRequestCommandMod extends js.Object {
  
  @js.native
  class GetPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetPullRequestInput, 
          OutputTypesUnion, 
          GetPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetPullRequestInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  }
}
