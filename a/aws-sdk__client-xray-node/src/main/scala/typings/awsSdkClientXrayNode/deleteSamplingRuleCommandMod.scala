package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", JSImport.Namespace)
@js.native
object deleteSamplingRuleCommandMod extends js.Object {
  @js.native
  class DeleteSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSamplingRuleInput, 
          OutputTypesUnion, 
          DeleteSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: DeleteSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[DeleteSamplingRuleInput, DeleteSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  }
  
}

