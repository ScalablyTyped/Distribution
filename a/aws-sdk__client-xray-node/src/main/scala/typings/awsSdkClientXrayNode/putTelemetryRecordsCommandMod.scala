package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTelemetryRecordsCommand", JSImport.Namespace)
@js.native
object putTelemetryRecordsCommandMod extends js.Object {
  @js.native
  class PutTelemetryRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutTelemetryRecordsInput, 
          OutputTypesUnion, 
          PutTelemetryRecordsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTelemetryRecordsInput) = this()
    val middlewareStack: MiddlewareStack[PutTelemetryRecordsInput, PutTelemetryRecordsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
  }
  
}

