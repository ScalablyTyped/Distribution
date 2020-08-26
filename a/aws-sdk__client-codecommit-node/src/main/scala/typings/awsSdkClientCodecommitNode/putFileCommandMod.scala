package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
import typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PutFileCommand", JSImport.Namespace)
@js.native
object putFileCommandMod extends js.Object {
  @js.native
  class PutFileCommand protected () extends Command[
          InputTypesUnion, 
          PutFileInput, 
          OutputTypesUnion, 
          PutFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutFileInput) = this()
    val middlewareStack: MiddlewareStack[PutFileInput, PutFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
  }
  
}

