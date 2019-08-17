package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsListBranchesCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListBranchesInputMod.ListBranchesInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListBranchesOutputMod.ListBranchesOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", "ListBranchesCommand")
@js.native
class ListBranchesCommand protected () extends Command[
      InputTypesUnion, 
      ListBranchesInput, 
      OutputTypesUnion, 
      ListBranchesOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListBranchesInput) = this()
  /* CompleteClass */
  override val input: ListBranchesInput = js.native
  val middlewareStack: MiddlewareStack[ListBranchesInput, ListBranchesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
}

