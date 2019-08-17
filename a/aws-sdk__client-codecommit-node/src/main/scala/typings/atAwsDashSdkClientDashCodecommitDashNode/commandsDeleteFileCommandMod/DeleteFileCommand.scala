package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsDeleteFileCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileInputMod.DeleteFileInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileOutputMod.DeleteFileOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", "DeleteFileCommand")
@js.native
class DeleteFileCommand protected () extends Command[
      InputTypesUnion, 
      DeleteFileInput, 
      OutputTypesUnion, 
      DeleteFileOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteFileInput) = this()
  /* CompleteClass */
  override val input: DeleteFileInput = js.native
  val middlewareStack: MiddlewareStack[DeleteFileInput, DeleteFileOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
}

