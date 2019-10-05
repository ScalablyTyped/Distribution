package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortVaultLockCommand", JSImport.Namespace)
@js.native
object commandsAbortVaultLockCommandMod extends js.Object {
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
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
  }
  
}

