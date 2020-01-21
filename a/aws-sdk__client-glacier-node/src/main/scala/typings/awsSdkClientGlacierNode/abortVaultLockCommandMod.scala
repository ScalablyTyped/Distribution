package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typings.awsSdkClientGlacierNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortVaultLockCommand", JSImport.Namespace)
@js.native
object abortVaultLockCommandMod extends js.Object {
  @js.native
  class AbortVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          AbortVaultLockInput, 
          OutputTypesUnion, 
          AbortVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AbortVaultLockInput) = this()
    /* CompleteClass */
    override val input: AbortVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[AbortVaultLockInput, AbortVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
  }
  
}

