package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
import typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteRepositoryCommand", JSImport.Namespace)
@js.native
object deleteRepositoryCommandMod extends js.Object {
  @js.native
  class DeleteRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          DeleteRepositoryInput, 
          OutputTypesUnion, 
          DeleteRepositoryOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteRepositoryInput) = this()
    val middlewareStack: MiddlewareStack[DeleteRepositoryInput, DeleteRepositoryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
  }
  
}

