package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typings.awsSdkClientXrayNode.typesGetSamplingRulesOutputMod.GetSamplingRulesOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSamplingRulesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetSamplingRulesCommand", "GetSamplingRulesCommand")
  @js.native
  open class GetSamplingRulesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSamplingRulesInput, 
          OutputTypesUnion, 
          GetSamplingRulesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetSamplingRulesInput) = this()
    
    /* CompleteClass */
    override val input: GetSamplingRulesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetSamplingRulesInput, GetSamplingRulesOutput] = js.native
  }
}
