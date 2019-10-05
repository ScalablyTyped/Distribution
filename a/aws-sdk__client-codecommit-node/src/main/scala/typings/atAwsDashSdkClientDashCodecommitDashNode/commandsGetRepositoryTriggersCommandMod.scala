package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object commandsGetRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class GetRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryTriggersInput, 
          OutputTypesUnion, 
          GetRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetRepositoryTriggersInput) = this()
    /* CompleteClass */
    override val input: GetRepositoryTriggersInput = js.native
    val middlewareStack: MiddlewareStack[GetRepositoryTriggersInput, GetRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
  }
  
}

