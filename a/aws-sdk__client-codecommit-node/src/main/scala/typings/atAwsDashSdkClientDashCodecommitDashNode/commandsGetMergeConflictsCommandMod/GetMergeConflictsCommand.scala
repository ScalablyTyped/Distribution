package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetMergeConflictsCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", "GetMergeConflictsCommand")
@js.native
class GetMergeConflictsCommand protected () extends Command[
      InputTypesUnion, 
      GetMergeConflictsInput, 
      OutputTypesUnion, 
      GetMergeConflictsOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetMergeConflictsInput) = this()
  /* CompleteClass */
  override val input: GetMergeConflictsInput = js.native
  val middlewareStack: MiddlewareStack[GetMergeConflictsInput, GetMergeConflictsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
}

