package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestTitleCommand", JSImport.Namespace)
@js.native
object commandsUpdatePullRequestTitleCommandMod extends js.Object {
  @js.native
  class UpdatePullRequestTitleCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestTitleInput, 
          OutputTypesUnion, 
          UpdatePullRequestTitleOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdatePullRequestTitleInput) = this()
    /* CompleteClass */
    override val input: UpdatePullRequestTitleInput = js.native
    val middlewareStack: MiddlewareStack[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
  }
  
}

