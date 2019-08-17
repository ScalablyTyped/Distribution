package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsUpdateDefaultBranchCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", "UpdateDefaultBranchCommand")
@js.native
class UpdateDefaultBranchCommand protected () extends Command[
      InputTypesUnion, 
      UpdateDefaultBranchInput, 
      OutputTypesUnion, 
      UpdateDefaultBranchOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateDefaultBranchInput) = this()
  /* CompleteClass */
  override val input: UpdateDefaultBranchInput = js.native
  val middlewareStack: MiddlewareStack[UpdateDefaultBranchInput, UpdateDefaultBranchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
}

