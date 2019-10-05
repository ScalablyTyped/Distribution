package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListAliasesInputMod.ListAliasesInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesListAliasesOutputMod.ListAliasesOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListAliasesCommand", JSImport.Namespace)
@js.native
object commandsListAliasesCommandMod extends js.Object {
  @js.native
  class ListAliasesCommand protected () extends Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListAliasesInput) = this()
    /* CompleteClass */
    override val input: ListAliasesInput = js.native
    val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
  
}

