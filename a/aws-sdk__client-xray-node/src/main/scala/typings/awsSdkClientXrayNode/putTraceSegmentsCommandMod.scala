package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putTraceSegmentsCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/PutTraceSegmentsCommand", "PutTraceSegmentsCommand")
  @js.native
  open class PutTraceSegmentsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutTraceSegmentsInput, 
          OutputTypesUnion, 
          PutTraceSegmentsOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: PutTraceSegmentsInput) = this()
    
    /* CompleteClass */
    override val input: PutTraceSegmentsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
}
