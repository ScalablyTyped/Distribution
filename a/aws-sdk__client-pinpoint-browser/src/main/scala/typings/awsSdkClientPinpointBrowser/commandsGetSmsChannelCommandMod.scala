package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSmsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSmsChannelCommand", "GetSmsChannelCommand")
  @js.native
  open class GetSmsChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSmsChannelInput, 
          OutputTypesUnion, 
          GetSmsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSmsChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetSmsChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSmsChannelInput, GetSmsChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
  }
}
