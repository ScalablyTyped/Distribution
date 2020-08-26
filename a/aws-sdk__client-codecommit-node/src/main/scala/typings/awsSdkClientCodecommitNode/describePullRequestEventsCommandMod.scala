package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DescribePullRequestEventsCommand", JSImport.Namespace)
@js.native
object describePullRequestEventsCommandMod extends js.Object {
  @js.native
  class DescribePullRequestEventsCommand protected () extends Command[
          InputTypesUnion, 
          DescribePullRequestEventsInput, 
          OutputTypesUnion, 
          DescribePullRequestEventsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribePullRequestEventsInput) = this()
    val middlewareStack: MiddlewareStack[DescribePullRequestEventsInput, DescribePullRequestEventsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
  }
  
}

