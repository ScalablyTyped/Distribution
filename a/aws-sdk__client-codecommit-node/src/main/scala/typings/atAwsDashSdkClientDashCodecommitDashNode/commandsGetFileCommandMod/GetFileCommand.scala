package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetFileCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileInputMod.GetFileInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileOutputMod.GetFileOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", "GetFileCommand")
@js.native
class GetFileCommand protected () extends Command[
      InputTypesUnion, 
      GetFileInput, 
      OutputTypesUnion, 
      GetFileOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetFileInput) = this()
  /* CompleteClass */
  override val input: GetFileInput = js.native
  val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetFileInput, GetFileOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetFileInput, GetFileOutput] = js.native
}

