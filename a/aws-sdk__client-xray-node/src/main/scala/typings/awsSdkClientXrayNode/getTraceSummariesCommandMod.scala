package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typings.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTraceSummariesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetTraceSummariesCommand", "GetTraceSummariesCommand")
  @js.native
  class GetTraceSummariesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetTraceSummariesInput, 
          OutputTypesUnion, 
          GetTraceSummariesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetTraceSummariesInput) = this()
    
    /* CompleteClass */
    override val input: GetTraceSummariesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: js.Any
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
  }
}
