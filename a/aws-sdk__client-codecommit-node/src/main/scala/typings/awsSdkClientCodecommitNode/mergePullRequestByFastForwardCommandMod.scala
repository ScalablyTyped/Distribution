package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
import typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/MergePullRequestByFastForwardCommand", JSImport.Namespace)
@js.native
object mergePullRequestByFastForwardCommandMod extends js.Object {
  @js.native
  class MergePullRequestByFastForwardCommand protected () extends Command[
          InputTypesUnion, 
          MergePullRequestByFastForwardInput, 
          OutputTypesUnion, 
          MergePullRequestByFastForwardOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: MergePullRequestByFastForwardInput) = this()
    val middlewareStack: MiddlewareStack[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
  }
  
}

