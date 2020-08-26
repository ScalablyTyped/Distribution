package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typings.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object listProvisionedCapacityCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[ListProvisionedCapacityInput, ListProvisionedCapacityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
  }
  
}

