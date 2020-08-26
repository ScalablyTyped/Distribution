package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typings.awsSdkClientXrayNode.typesGetSamplingRulesOutputMod.GetSamplingRulesOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingRulesCommand", JSImport.Namespace)
@js.native
object getSamplingRulesCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[GetSamplingRulesInput, GetSamplingRulesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
  }
  
}

