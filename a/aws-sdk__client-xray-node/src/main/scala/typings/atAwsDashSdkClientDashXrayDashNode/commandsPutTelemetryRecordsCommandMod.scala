package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTelemetryRecordsCommand", JSImport.Namespace)
@js.native
object commandsPutTelemetryRecordsCommandMod extends js.Object {
  @js.native
  class PutTelemetryRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutTelemetryRecordsInput, 
          OutputTypesUnion, 
          PutTelemetryRecordsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTelemetryRecordsInput) = this()
    /* CompleteClass */
    override val input: PutTelemetryRecordsInput = js.native
    val middlewareStack: MiddlewareStack[PutTelemetryRecordsInput, PutTelemetryRecordsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
  }
  
}

