package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsCreateBranchCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateBranchInputMod.CreateBranchInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateBranchOutputMod.CreateBranchOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", "CreateBranchCommand")
@js.native
class CreateBranchCommand protected () extends Command[
      InputTypesUnion, 
      CreateBranchInput, 
      OutputTypesUnion, 
      CreateBranchOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateBranchInput) = this()
  /* CompleteClass */
  override val input: CreateBranchInput = js.native
  val middlewareStack: MiddlewareStack[CreateBranchInput, CreateBranchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
}

