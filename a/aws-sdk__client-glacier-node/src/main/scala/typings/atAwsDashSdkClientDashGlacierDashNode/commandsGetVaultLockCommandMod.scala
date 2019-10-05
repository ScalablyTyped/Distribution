package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultLockInputMod.GetVaultLockInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultLockCommand", JSImport.Namespace)
@js.native
object commandsGetVaultLockCommandMod extends js.Object {
  @js.native
  class GetVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultLockInput, 
          OutputTypesUnion, 
          GetVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultLockInput) = this()
    /* CompleteClass */
    override val input: GetVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[GetVaultLockInput, GetVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
  }
  
}

