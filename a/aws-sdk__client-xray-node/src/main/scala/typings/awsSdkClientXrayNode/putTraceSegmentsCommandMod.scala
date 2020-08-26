package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTraceSegmentsCommand", JSImport.Namespace)
@js.native
object putTraceSegmentsCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[PutTraceSegmentsInput, PutTraceSegmentsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
  
}

