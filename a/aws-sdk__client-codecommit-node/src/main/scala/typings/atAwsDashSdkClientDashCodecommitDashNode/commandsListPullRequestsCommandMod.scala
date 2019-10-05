package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", JSImport.Namespace)
@js.native
object commandsListPullRequestsCommandMod extends js.Object {
  @js.native
  class ListPullRequestsCommand protected () extends Command[
          InputTypesUnion, 
          ListPullRequestsInput, 
          OutputTypesUnion, 
          ListPullRequestsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListPullRequestsInput) = this()
    /* CompleteClass */
    override val input: ListPullRequestsInput = js.native
    val middlewareStack: MiddlewareStack[ListPullRequestsInput, ListPullRequestsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
  
}

