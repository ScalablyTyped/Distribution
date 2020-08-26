package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typings.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingTargetsCommand", JSImport.Namespace)
@js.native
object getSamplingTargetsCommandMod extends js.Object {
  @js.native
  class GetSamplingTargetsCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingTargetsInput, 
          OutputTypesUnion, 
          GetSamplingTargetsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingTargetsInput) = this()
    val middlewareStack: MiddlewareStack[GetSamplingTargetsInput, GetSamplingTargetsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
  }
  
}

