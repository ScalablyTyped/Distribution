package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/TestRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object commandsTestRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class TestRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          TestRepositoryTriggersInput, 
          OutputTypesUnion, 
          TestRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: TestRepositoryTriggersInput) = this()
    /* CompleteClass */
    override val input: TestRepositoryTriggersInput = js.native
    val middlewareStack: MiddlewareStack[TestRepositoryTriggersInput, TestRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
  }
  
}

