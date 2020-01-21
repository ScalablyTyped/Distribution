package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
import typings.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", JSImport.Namespace)
@js.native
object getFileCommandMod extends js.Object {
  @js.native
  class GetFileCommand protected () extends Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFileInput) = this()
    /* CompleteClass */
    override val input: GetFileInput = js.native
    val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
  
}

