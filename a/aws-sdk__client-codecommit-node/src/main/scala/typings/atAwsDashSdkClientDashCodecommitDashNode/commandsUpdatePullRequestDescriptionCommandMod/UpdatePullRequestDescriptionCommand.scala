package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsUpdatePullRequestDescriptionCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestDescriptionCommand", "UpdatePullRequestDescriptionCommand")
@js.native
class UpdatePullRequestDescriptionCommand protected () extends Command[
      InputTypesUnion, 
      UpdatePullRequestDescriptionInput, 
      OutputTypesUnion, 
      UpdatePullRequestDescriptionOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdatePullRequestDescriptionInput) = this()
  /* CompleteClass */
  override val input: UpdatePullRequestDescriptionInput = js.native
  val middlewareStack: MiddlewareStack[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
}

