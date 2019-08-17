package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsDeleteBranchCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchInputMod.DeleteBranchInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", "DeleteBranchCommand")
@js.native
class DeleteBranchCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBranchInput, 
      OutputTypesUnion, 
      DeleteBranchOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBranchInput) = this()
  /* CompleteClass */
  override val input: DeleteBranchInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBranchInput, DeleteBranchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
}

