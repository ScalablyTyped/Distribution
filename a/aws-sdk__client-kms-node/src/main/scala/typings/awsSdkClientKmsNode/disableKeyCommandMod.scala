package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
import typings.awsSdkClientKmsNode.typesDisableKeyOutputMod.DisableKeyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DisableKeyCommand", JSImport.Namespace)
@js.native
object disableKeyCommandMod extends js.Object {
  @js.native
  class DisableKeyCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyInput, 
          OutputTypesUnion, 
          DisableKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DisableKeyInput) = this()
    val middlewareStack: MiddlewareStack[DisableKeyInput, DisableKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
  }
  
}

