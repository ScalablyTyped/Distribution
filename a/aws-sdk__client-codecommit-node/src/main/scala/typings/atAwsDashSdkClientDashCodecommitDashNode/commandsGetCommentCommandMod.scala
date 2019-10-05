package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentInputMod.GetCommentInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentOutputMod.GetCommentOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentCommand", JSImport.Namespace)
@js.native
object commandsGetCommentCommandMod extends js.Object {
  @js.native
  class GetCommentCommand protected () extends Command[
          InputTypesUnion, 
          GetCommentInput, 
          OutputTypesUnion, 
          GetCommentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommentInput) = this()
    /* CompleteClass */
    override val input: GetCommentInput = js.native
    val middlewareStack: MiddlewareStack[GetCommentInput, GetCommentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentInput, GetCommentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentInput, GetCommentOutput] = js.native
  }
  
}

