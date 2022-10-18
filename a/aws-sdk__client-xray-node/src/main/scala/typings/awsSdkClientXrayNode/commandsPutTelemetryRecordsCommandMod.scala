package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutTelemetryRecordsCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/PutTelemetryRecordsCommand", "PutTelemetryRecordsCommand")
  @js.native
  open class PutTelemetryRecordsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutTelemetryRecordsInput, 
          OutputTypesUnion, 
          PutTelemetryRecordsOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: PutTelemetryRecordsInput) = this()
    
    /* CompleteClass */
    override val input: PutTelemetryRecordsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
  }
}
