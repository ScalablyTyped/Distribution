package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", JSImport.Namespace)
@js.native
object batchGetRepositoriesCommandMod extends js.Object {
  @js.native
  class BatchGetRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetRepositoriesInput, 
          OutputTypesUnion, 
          BatchGetRepositoriesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetRepositoriesInput) = this()
    /* CompleteClass */
    override val input: BatchGetRepositoriesInput = js.native
    val middlewareStack: MiddlewareStack[BatchGetRepositoriesInput, BatchGetRepositoriesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  }
  
}

