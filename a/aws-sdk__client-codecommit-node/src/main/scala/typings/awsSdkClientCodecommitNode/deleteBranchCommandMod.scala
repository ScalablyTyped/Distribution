package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
import typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", JSImport.Namespace)
@js.native
object deleteBranchCommandMod extends js.Object {
  @js.native
  class DeleteBranchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBranchInput, 
          OutputTypesUnion, 
          DeleteBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBranchInput) = this()
    /* CompleteClass */
    override val input: DeleteBranchInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBranchInput, DeleteBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  }
  
}

