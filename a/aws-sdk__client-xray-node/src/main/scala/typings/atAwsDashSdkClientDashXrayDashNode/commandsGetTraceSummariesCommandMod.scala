package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceSummariesCommand", JSImport.Namespace)
@js.native
object commandsGetTraceSummariesCommandMod extends js.Object {
  @js.native
  class GetTraceSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceSummariesInput, 
          OutputTypesUnion, 
          GetTraceSummariesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetTraceSummariesInput) = this()
    /* CompleteClass */
    override val input: GetTraceSummariesInput = js.native
    val middlewareStack: MiddlewareStack[GetTraceSummariesInput, GetTraceSummariesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
  }
  
}

