package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultNotificationsCommand", JSImport.Namespace)
@js.native
object setVaultNotificationsCommandMod extends js.Object {
  @js.native
  class SetVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          SetVaultNotificationsInput, 
          OutputTypesUnion, 
          SetVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetVaultNotificationsInput) = this()
    /* CompleteClass */
    override val input: SetVaultNotificationsInput = js.native
    val middlewareStack: MiddlewareStack[SetVaultNotificationsInput, SetVaultNotificationsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
  }
  
}

