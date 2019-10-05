package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object commandsListProvisionedCapacityCommandMod extends js.Object {
  @js.native
  class ListProvisionedCapacityCommand protected () extends Command[
          InputTypesUnion, 
          ListProvisionedCapacityInput, 
          OutputTypesUnion, 
          ListProvisionedCapacityOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListProvisionedCapacityInput) = this()
    /* CompleteClass */
    override val input: ListProvisionedCapacityInput = js.native
    val middlewareStack: MiddlewareStack[ListProvisionedCapacityInput, ListProvisionedCapacityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
  }
  
}

