package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
import typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", JSImport.Namespace)
@js.native
object listBranchesCommandMod extends js.Object {
  
  @js.native
  class ListBranchesCommand protected () extends Command[
          InputTypesUnion, 
          ListBranchesInput, 
          OutputTypesUnion, 
          ListBranchesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListBranchesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  }
}
