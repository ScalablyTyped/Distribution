package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
import typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", JSImport.Namespace)
@js.native
object getFolderCommandMod extends js.Object {
  @js.native
  class GetFolderCommand protected () extends Command[
          InputTypesUnion, 
          GetFolderInput, 
          OutputTypesUnion, 
          GetFolderOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFolderInput) = this()
    val middlewareStack: MiddlewareStack[GetFolderInput, GetFolderOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
  }
  
}

