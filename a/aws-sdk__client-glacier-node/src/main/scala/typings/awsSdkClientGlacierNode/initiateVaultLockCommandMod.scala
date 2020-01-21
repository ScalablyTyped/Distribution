package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typings.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateVaultLockCommand", JSImport.Namespace)
@js.native
object initiateVaultLockCommandMod extends js.Object {
  @js.native
  class InitiateVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          InitiateVaultLockInput, 
          OutputTypesUnion, 
          InitiateVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateVaultLockInput) = this()
    /* CompleteClass */
    override val input: InitiateVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[InitiateVaultLockInput, InitiateVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
  }
  
}

