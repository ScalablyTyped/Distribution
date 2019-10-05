package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetParametersForImportInputMod.GetParametersForImportInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GetParametersForImportCommand", JSImport.Namespace)
@js.native
object commandsGetParametersForImportCommandMod extends js.Object {
  @js.native
  class GetParametersForImportCommand protected () extends Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetParametersForImportInput) = this()
    /* CompleteClass */
    override val input: GetParametersForImportInput = js.native
    val middlewareStack: MiddlewareStack[GetParametersForImportInput, GetParametersForImportOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
  
}

