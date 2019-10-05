package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/PurchaseProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object commandsPurchaseProvisionedCapacityCommandMod extends js.Object {
  @js.native
  class PurchaseProvisionedCapacityCommand protected () extends Command[
          InputTypesUnion, 
          PurchaseProvisionedCapacityInput, 
          OutputTypesUnion, 
          PurchaseProvisionedCapacityOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: PurchaseProvisionedCapacityInput) = this()
    /* CompleteClass */
    override val input: PurchaseProvisionedCapacityInput = js.native
    val middlewareStack: MiddlewareStack[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
  }
  
}

