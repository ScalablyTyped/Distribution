package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryInputMod.CreateRepositoryInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateRepositoryCommand", JSImport.Namespace)
@js.native
object commandsCreateRepositoryCommandMod extends js.Object {
  @js.native
  class CreateRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          CreateRepositoryInput, 
          OutputTypesUnion, 
          CreateRepositoryOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateRepositoryInput) = this()
    /* CompleteClass */
    override val input: CreateRepositoryInput = js.native
    val middlewareStack: MiddlewareStack[CreateRepositoryInput, CreateRepositoryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
  }
  
}

