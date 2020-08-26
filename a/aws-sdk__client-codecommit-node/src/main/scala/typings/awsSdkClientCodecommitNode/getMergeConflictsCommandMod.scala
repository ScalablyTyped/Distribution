package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", JSImport.Namespace)
@js.native
object getMergeConflictsCommandMod extends js.Object {
  @js.native
  class GetMergeConflictsCommand protected () extends Command[
          InputTypesUnion, 
          GetMergeConflictsInput, 
          OutputTypesUnion, 
          GetMergeConflictsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetMergeConflictsInput) = this()
    val middlewareStack: MiddlewareStack[GetMergeConflictsInput, GetMergeConflictsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  }
  
}

