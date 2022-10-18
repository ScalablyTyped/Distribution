package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.awsSdkClientXrayNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetServiceGraphCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", "GetServiceGraphCommand")
  @js.native
  open class GetServiceGraphCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetServiceGraphInput) = this()
    
    /* CompleteClass */
    override val input: GetServiceGraphInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
}
