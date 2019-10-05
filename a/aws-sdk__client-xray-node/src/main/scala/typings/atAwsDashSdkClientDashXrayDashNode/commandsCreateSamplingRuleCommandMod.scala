package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleOutputMod.CreateSamplingRuleOutput
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

@JSImport("@aws-sdk/client-xray-node/commands/CreateSamplingRuleCommand", JSImport.Namespace)
@js.native
object commandsCreateSamplingRuleCommandMod extends js.Object {
  @js.native
  class CreateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          CreateSamplingRuleInput, 
          OutputTypesUnion, 
          CreateSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: CreateSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[CreateSamplingRuleInput, CreateSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
  }
  
}

