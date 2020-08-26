package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
import typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", JSImport.Namespace)
@js.native
object getBlobCommandMod extends js.Object {
  @js.native
  class GetBlobCommand protected () extends Command[
          InputTypesUnion, 
          GetBlobInput, 
          OutputTypesUnion, 
          GetBlobOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBlobInput) = this()
    val middlewareStack: MiddlewareStack[GetBlobInput, GetBlobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
  
}

