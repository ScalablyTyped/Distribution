package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CancelKeyDeletionCommand", JSImport.Namespace)
@js.native
object commandsCancelKeyDeletionCommandMod extends js.Object {
  @js.native
  class CancelKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          CancelKeyDeletionInput, 
          OutputTypesUnion, 
          CancelKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CancelKeyDeletionInput) = this()
    /* CompleteClass */
    override val input: CancelKeyDeletionInput = js.native
    val middlewareStack: MiddlewareStack[CancelKeyDeletionInput, CancelKeyDeletionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  }
  
}

