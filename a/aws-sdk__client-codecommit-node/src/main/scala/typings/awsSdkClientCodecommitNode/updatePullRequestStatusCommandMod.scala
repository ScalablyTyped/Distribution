package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestStatusCommand", JSImport.Namespace)
@js.native
object updatePullRequestStatusCommandMod extends js.Object {
  @js.native
  class UpdatePullRequestStatusCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestStatusInput, 
          OutputTypesUnion, 
          UpdatePullRequestStatusOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdatePullRequestStatusInput) = this()
    val middlewareStack: MiddlewareStack[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
  }
  
}

