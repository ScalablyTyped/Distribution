package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetBranchCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBranchInputMod.GetBranchInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBranchOutputMod.GetBranchOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBranchCommand", "GetBranchCommand")
@js.native
class GetBranchCommand protected () extends Command[
      InputTypesUnion, 
      GetBranchInput, 
      OutputTypesUnion, 
      GetBranchOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetBranchInput) = this()
  /* CompleteClass */
  override val input: GetBranchInput = js.native
  val middlewareStack: MiddlewareStack[GetBranchInput, GetBranchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetBranchInput, GetBranchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetBranchInput, GetBranchOutput] = js.native
}

