package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetCommentsForComparedCommitCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForComparedCommitCommand", "GetCommentsForComparedCommitCommand")
@js.native
class GetCommentsForComparedCommitCommand protected () extends Command[
      InputTypesUnion, 
      GetCommentsForComparedCommitInput, 
      OutputTypesUnion, 
      GetCommentsForComparedCommitOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetCommentsForComparedCommitInput) = this()
  /* CompleteClass */
  override val input: GetCommentsForComparedCommitInput = js.native
  val middlewareStack: MiddlewareStack[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
}

