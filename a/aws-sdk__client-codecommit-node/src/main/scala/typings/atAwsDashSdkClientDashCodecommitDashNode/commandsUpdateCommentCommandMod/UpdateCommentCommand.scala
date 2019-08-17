package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsUpdateCommentCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentInputMod.UpdateCommentInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentOutputMod.UpdateCommentOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateCommentCommand", "UpdateCommentCommand")
@js.native
class UpdateCommentCommand protected () extends Command[
      InputTypesUnion, 
      UpdateCommentInput, 
      OutputTypesUnion, 
      UpdateCommentOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateCommentInput) = this()
  /* CompleteClass */
  override val input: UpdateCommentInput = js.native
  val middlewareStack: MiddlewareStack[UpdateCommentInput, UpdateCommentOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
}

