package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typings.awsSdkClientKmsNode.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CancelKeyDeletionCommand", JSImport.Namespace)
@js.native
object cancelKeyDeletionCommandMod extends js.Object {
  @js.native
  class CancelKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          CancelKeyDeletionInput, 
          OutputTypesUnion, 
          CancelKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CancelKeyDeletionInput) = this()
    val middlewareStack: MiddlewareStack[CancelKeyDeletionInput, CancelKeyDeletionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  }
  
}

