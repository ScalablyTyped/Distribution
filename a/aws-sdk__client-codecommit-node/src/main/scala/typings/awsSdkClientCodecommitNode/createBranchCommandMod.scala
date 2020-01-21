package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
import typings.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", JSImport.Namespace)
@js.native
object createBranchCommandMod extends js.Object {
  @js.native
  class CreateBranchCommand protected () extends Command[
          InputTypesUnion, 
          CreateBranchInput, 
          OutputTypesUnion, 
          CreateBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBranchInput) = this()
    /* CompleteClass */
    override val input: CreateBranchInput = js.native
    val middlewareStack: MiddlewareStack[CreateBranchInput, CreateBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  }
  
}

