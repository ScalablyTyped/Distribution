package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typings.awsSdkClientXrayNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsBatchGetTracesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", "BatchGetTracesCommand")
  @js.native
  open class BatchGetTracesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          BatchGetTracesInput, 
          OutputTypesUnion, 
          BatchGetTracesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: BatchGetTracesInput) = this()
    
    /* CompleteClass */
    override val input: BatchGetTracesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[BatchGetTracesInput, BatchGetTracesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  }
}
