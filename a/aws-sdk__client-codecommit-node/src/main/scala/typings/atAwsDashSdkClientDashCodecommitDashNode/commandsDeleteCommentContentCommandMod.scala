package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteCommentContentCommand", JSImport.Namespace)
@js.native
object commandsDeleteCommentContentCommandMod extends js.Object {
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
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
  }
  
}

