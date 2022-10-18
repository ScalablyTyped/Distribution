package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typings.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSamplingTargetsCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetSamplingTargetsCommand", "GetSamplingTargetsCommand")
  @js.native
  open class GetSamplingTargetsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSamplingTargetsInput, 
          OutputTypesUnion, 
          GetSamplingTargetsOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetSamplingTargetsInput) = this()
    
    /* CompleteClass */
    override val input: GetSamplingTargetsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
  }
}
