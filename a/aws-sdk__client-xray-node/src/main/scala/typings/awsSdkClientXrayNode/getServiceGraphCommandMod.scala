package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.awsSdkClientXrayNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServiceGraphCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", "GetServiceGraphCommand")
  @js.native
  class GetServiceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetServiceGraphInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
}
