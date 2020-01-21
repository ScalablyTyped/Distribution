package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteCommentContentCommand", JSImport.Namespace)
@js.native
object deleteCommentContentCommandMod extends js.Object {
  @js.native
  class DeleteCommentContentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCommentContentInput, 
          OutputTypesUnion, 
          DeleteCommentContentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteCommentContentInput) = this()
    /* CompleteClass */
    override val input: DeleteCommentContentInput = js.native
    val middlewareStack: MiddlewareStack[DeleteCommentContentInput, DeleteCommentContentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
  }
  
}

