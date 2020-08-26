package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typings.awsSdkClientXrayNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", JSImport.Namespace)
@js.native
object batchGetTracesCommandMod extends js.Object {
  @js.native
  class BatchGetTracesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetTracesInput, 
          OutputTypesUnion, 
          BatchGetTracesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetTracesInput) = this()
    val middlewareStack: MiddlewareStack[BatchGetTracesInput, BatchGetTracesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  }
  
}

