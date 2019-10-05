package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PutRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object commandsPutRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class PutRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          PutRepositoryTriggersInput, 
          OutputTypesUnion, 
          PutRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutRepositoryTriggersInput) = this()
    /* CompleteClass */
    override val input: PutRepositoryTriggersInput = js.native
    val middlewareStack: MiddlewareStack[PutRepositoryTriggersInput, PutRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
  }
  
}

