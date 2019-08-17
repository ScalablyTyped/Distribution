package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetDifferencesCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesInputMod.GetDifferencesInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", "GetDifferencesCommand")
@js.native
class GetDifferencesCommand protected () extends Command[
      InputTypesUnion, 
      GetDifferencesInput, 
      OutputTypesUnion, 
      GetDifferencesOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetDifferencesInput) = this()
  /* CompleteClass */
  override val input: GetDifferencesInput = js.native
  val middlewareStack: MiddlewareStack[GetDifferencesInput, GetDifferencesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
}

