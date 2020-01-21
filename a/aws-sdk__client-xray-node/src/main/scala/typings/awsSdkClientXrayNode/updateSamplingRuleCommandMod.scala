package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/UpdateSamplingRuleCommand", JSImport.Namespace)
@js.native
object updateSamplingRuleCommandMod extends js.Object {
  @js.native
  class UpdateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSamplingRuleInput, 
          OutputTypesUnion, 
          UpdateSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: UpdateSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[UpdateSamplingRuleInput, UpdateSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  }
  
}

