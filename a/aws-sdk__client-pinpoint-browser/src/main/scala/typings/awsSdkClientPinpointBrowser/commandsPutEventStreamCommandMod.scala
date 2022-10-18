package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutEventStreamCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventStreamCommand", "PutEventStreamCommand")
  @js.native
  open class PutEventStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutEventStreamInput, 
          OutputTypesUnion, 
          PutEventStreamOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: PutEventStreamInput) = this()
    
    /* CompleteClass */
    override val input: PutEventStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutEventStreamInput, PutEventStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
  }
}
