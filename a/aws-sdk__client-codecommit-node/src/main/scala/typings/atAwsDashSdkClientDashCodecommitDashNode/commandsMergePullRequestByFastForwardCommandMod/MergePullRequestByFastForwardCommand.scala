package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsMergePullRequestByFastForwardCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/MergePullRequestByFastForwardCommand", "MergePullRequestByFastForwardCommand")
@js.native
class MergePullRequestByFastForwardCommand protected () extends Command[
      InputTypesUnion, 
      MergePullRequestByFastForwardInput, 
      OutputTypesUnion, 
      MergePullRequestByFastForwardOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: MergePullRequestByFastForwardInput) = this()
  /* CompleteClass */
  override val input: MergePullRequestByFastForwardInput = js.native
  val middlewareStack: MiddlewareStack[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
}

