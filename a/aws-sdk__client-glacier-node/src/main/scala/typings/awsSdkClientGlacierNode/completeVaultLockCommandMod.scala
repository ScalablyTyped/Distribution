package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
import typings.awsSdkClientGlacierNode.typesCompleteVaultLockOutputMod.CompleteVaultLockOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CompleteVaultLockCommand", JSImport.Namespace)
@js.native
object completeVaultLockCommandMod extends js.Object {
  @js.native
  class CompleteVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          CompleteVaultLockInput, 
          OutputTypesUnion, 
          CompleteVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: CompleteVaultLockInput) = this()
    val middlewareStack: MiddlewareStack[CompleteVaultLockInput, CompleteVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
  }
  
}

