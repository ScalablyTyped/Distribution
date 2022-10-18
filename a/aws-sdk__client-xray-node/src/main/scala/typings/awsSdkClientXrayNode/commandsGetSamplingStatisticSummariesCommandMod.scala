package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSamplingStatisticSummariesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetSamplingStatisticSummariesCommand", "GetSamplingStatisticSummariesCommand")
  @js.native
  open class GetSamplingStatisticSummariesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSamplingStatisticSummariesInput, 
          OutputTypesUnion, 
          GetSamplingStatisticSummariesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetSamplingStatisticSummariesInput) = this()
    
    /* CompleteClass */
    override val input: GetSamplingStatisticSummariesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
  }
}
