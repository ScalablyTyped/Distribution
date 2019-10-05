package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListVaultsInputMod.ListVaultsInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesListVaultsOutputMod.ListVaultsOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListVaultsCommand", JSImport.Namespace)
@js.native
object commandsListVaultsCommandMod extends js.Object {
  @js.native
  class ListVaultsCommand protected () extends Command[
          InputTypesUnion, 
          ListVaultsInput, 
          OutputTypesUnion, 
          ListVaultsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVaultsInput) = this()
    /* CompleteClass */
    override val input: ListVaultsInput = js.native
    val middlewareStack: MiddlewareStack[ListVaultsInput, ListVaultsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
  }
  
}

