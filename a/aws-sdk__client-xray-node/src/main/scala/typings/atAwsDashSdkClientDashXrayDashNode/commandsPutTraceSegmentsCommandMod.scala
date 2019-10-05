package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTraceSegmentsCommand", JSImport.Namespace)
@js.native
object commandsPutTraceSegmentsCommandMod extends js.Object {
  @js.native
  class PutTraceSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          PutTraceSegmentsInput, 
          OutputTypesUnion, 
          PutTraceSegmentsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTraceSegmentsInput) = this()
    /* CompleteClass */
    override val input: PutTraceSegmentsInput = js.native
    val middlewareStack: MiddlewareStack[PutTraceSegmentsInput, PutTraceSegmentsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
  
}

