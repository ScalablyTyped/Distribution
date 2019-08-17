package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsDeleteRepositoryCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteRepositoryCommand", "DeleteRepositoryCommand")
@js.native
class DeleteRepositoryCommand protected () extends Command[
      InputTypesUnion, 
      DeleteRepositoryInput, 
      OutputTypesUnion, 
      DeleteRepositoryOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteRepositoryInput) = this()
  /* CompleteClass */
  override val input: DeleteRepositoryInput = js.native
  val middlewareStack: MiddlewareStack[DeleteRepositoryInput, DeleteRepositoryOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
}

