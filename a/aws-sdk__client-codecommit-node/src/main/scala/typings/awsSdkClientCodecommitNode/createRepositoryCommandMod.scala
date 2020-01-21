package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateRepositoryCommand", JSImport.Namespace)
@js.native
object createRepositoryCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
  }
  
}

