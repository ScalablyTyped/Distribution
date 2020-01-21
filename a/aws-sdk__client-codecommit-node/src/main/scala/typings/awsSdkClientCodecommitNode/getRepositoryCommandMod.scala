package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
import typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", JSImport.Namespace)
@js.native
object getRepositoryCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  }
  
}

