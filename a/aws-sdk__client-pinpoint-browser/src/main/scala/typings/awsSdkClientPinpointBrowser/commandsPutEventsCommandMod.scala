package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
import typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutEventsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventsCommand", "PutEventsCommand")
  @js.native
  open class PutEventsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutEventsInput, 
          OutputTypesUnion, 
          PutEventsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: PutEventsInput) = this()
    
    /* CompleteClass */
    override val input: PutEventsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutEventsInput, PutEventsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
  }
}
