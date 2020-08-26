package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/PurchaseProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object purchaseProvisionedCapacityCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
  }
  
}

