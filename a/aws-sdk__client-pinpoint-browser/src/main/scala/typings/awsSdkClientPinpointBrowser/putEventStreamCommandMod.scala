package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putEventStreamCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventStreamCommand", "PutEventStreamCommand")
  @js.native
  class PutEventStreamCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
  }
}
