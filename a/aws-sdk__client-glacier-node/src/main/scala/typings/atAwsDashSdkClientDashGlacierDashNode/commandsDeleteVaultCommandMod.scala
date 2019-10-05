package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultInputMod.DeleteVaultInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultOutputMod.DeleteVaultOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultCommand", JSImport.Namespace)
@js.native
object commandsDeleteVaultCommandMod extends js.Object {
  @js.native
  class DeleteVaultCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultInput, 
          OutputTypesUnion, 
          DeleteVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultInput, DeleteVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
  }
  
}

