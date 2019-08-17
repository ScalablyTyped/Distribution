package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetPullRequestCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetPullRequestInputMod.GetPullRequestInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", "GetPullRequestCommand")
@js.native
class GetPullRequestCommand protected () extends Command[
      InputTypesUnion, 
      GetPullRequestInput, 
      OutputTypesUnion, 
      GetPullRequestOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetPullRequestInput) = this()
  /* CompleteClass */
  override val input: GetPullRequestInput = js.native
  val middlewareStack: MiddlewareStack[GetPullRequestInput, GetPullRequestOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
}

