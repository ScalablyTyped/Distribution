package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
import typings.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBranchCommand", JSImport.Namespace)
@js.native
object getBranchCommandMod extends js.Object {
  @js.native
  class GetBranchCommand protected () extends Command[
          InputTypesUnion, 
          GetBranchInput, 
          OutputTypesUnion, 
          GetBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBranchInput) = this()
    val middlewareStack: MiddlewareStack[GetBranchInput, GetBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
  }
  
}

