package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typings.awsSdkClientXrayNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceGraphCommand", JSImport.Namespace)
@js.native
object getTraceGraphCommandMod extends js.Object {
  @js.native
  class GetTraceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceGraphInput, 
          OutputTypesUnion, 
          GetTraceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetTraceGraphInput) = this()
    val middlewareStack: MiddlewareStack[GetTraceGraphInput, GetTraceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
  }
  
}

