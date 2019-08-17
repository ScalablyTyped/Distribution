package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsBatchGetRepositoriesCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", "BatchGetRepositoriesCommand")
@js.native
class BatchGetRepositoriesCommand protected () extends Command[
      InputTypesUnion, 
      BatchGetRepositoriesInput, 
      OutputTypesUnion, 
      BatchGetRepositoriesOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: BatchGetRepositoriesInput) = this()
  /* CompleteClass */
  override val input: BatchGetRepositoriesInput = js.native
  val middlewareStack: MiddlewareStack[BatchGetRepositoriesInput, BatchGetRepositoriesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
}

