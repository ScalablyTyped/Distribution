package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryNameCommand", JSImport.Namespace)
@js.native
object commandsUpdateRepositoryNameCommandMod extends js.Object {
  @js.native
  class UpdateRepositoryNameCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryNameInput, 
          OutputTypesUnion, 
          UpdateRepositoryNameOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateRepositoryNameInput) = this()
    /* CompleteClass */
    override val input: UpdateRepositoryNameInput = js.native
    val middlewareStack: MiddlewareStack[UpdateRepositoryNameInput, UpdateRepositoryNameOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
  }
  
}

