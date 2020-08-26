package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", JSImport.Namespace)
@js.native
object updateDefaultBranchCommandMod extends js.Object {
  @js.native
  class UpdateDefaultBranchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateDefaultBranchInput, 
          OutputTypesUnion, 
          UpdateDefaultBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateDefaultBranchInput) = this()
    val middlewareStack: MiddlewareStack[UpdateDefaultBranchInput, UpdateDefaultBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  }
  
}

