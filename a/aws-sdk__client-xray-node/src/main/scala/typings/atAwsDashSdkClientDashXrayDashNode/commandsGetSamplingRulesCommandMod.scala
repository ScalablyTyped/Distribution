package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingRulesOutputMod.GetSamplingRulesOutput
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

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingRulesCommand", JSImport.Namespace)
@js.native
object commandsGetSamplingRulesCommandMod extends js.Object {
  @js.native
  class GetSamplingRulesCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingRulesInput, 
          OutputTypesUnion, 
          GetSamplingRulesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingRulesInput) = this()
    /* CompleteClass */
    override val input: GetSamplingRulesInput = js.native
    val middlewareStack: MiddlewareStack[GetSamplingRulesInput, GetSamplingRulesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
  }
  
}

