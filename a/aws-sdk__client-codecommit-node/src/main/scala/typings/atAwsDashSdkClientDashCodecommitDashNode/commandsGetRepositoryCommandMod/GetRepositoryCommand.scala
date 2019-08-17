package typings.atAwsDashSdkClientDashCodecommitDashNode.commandsGetRepositoryCommandMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetRepositoryInputMod.GetRepositoryInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", "GetRepositoryCommand")
@js.native
class GetRepositoryCommand protected () extends Command[
      InputTypesUnion, 
      GetRepositoryInput, 
      OutputTypesUnion, 
      GetRepositoryOutput, 
      CodeCommitResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetRepositoryInput) = this()
  /* CompleteClass */
  override val input: GetRepositoryInput = js.native
  val middlewareStack: MiddlewareStack[GetRepositoryInput, GetRepositoryOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: CodeCommitResolvedConfiguration
  ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
}

