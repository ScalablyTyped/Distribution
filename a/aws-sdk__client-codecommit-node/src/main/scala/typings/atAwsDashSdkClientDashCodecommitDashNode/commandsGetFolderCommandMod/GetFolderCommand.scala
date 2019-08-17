package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetFolderCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderInputMod.GetFolderInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderOutputMod.GetFolderOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", "GetFolderCommand")
@js.native
class GetFolderCommand protected () extends Command[
      InputTypesUnion, 
      GetFolderInput, 
      OutputTypesUnion, 
      GetFolderOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetFolderInput) = this()
  /* CompleteClass */
  override val input: GetFolderInput = js.native
  val middlewareStack: MiddlewareStack[GetFolderInput, GetFolderOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetFolderInput, GetFolderOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetFolderInput, GetFolderOutput] = js.native
}

