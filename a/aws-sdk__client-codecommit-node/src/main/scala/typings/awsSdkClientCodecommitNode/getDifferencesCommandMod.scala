package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
import typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", JSImport.Namespace)
@js.native
object getDifferencesCommandMod extends js.Object {
  @js.native
  class GetDifferencesCommand protected () extends Command[
          InputTypesUnion, 
          GetDifferencesInput, 
          OutputTypesUnion, 
          GetDifferencesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetDifferencesInput) = this()
    /* CompleteClass */
    override val input: GetDifferencesInput = js.native
    val middlewareStack: MiddlewareStack[GetDifferencesInput, GetDifferencesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  }
  
}

