package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.awsSdkClientXrayNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", JSImport.Namespace)
@js.native
object getServiceGraphCommandMod extends js.Object {
  @js.native
  class GetServiceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetServiceGraphInput) = this()
    /* CompleteClass */
    override val input: GetServiceGraphInput = js.native
    val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
  
}

