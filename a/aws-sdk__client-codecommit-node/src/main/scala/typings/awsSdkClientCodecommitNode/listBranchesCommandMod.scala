package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
import typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", JSImport.Namespace)
@js.native
object listBranchesCommandMod extends js.Object {
  @js.native
  class ListBranchesCommand protected () extends Command[
          InputTypesUnion, 
          ListBranchesInput, 
          OutputTypesUnion, 
          ListBranchesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBranchesInput) = this()
    /* CompleteClass */
    override val input: ListBranchesInput = js.native
    val middlewareStack: MiddlewareStack[ListBranchesInput, ListBranchesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  }
  
}

