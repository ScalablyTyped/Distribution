package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetAdmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAdmChannelCommand", "GetAdmChannelCommand")
  @js.native
  open class GetAdmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetAdmChannelInput, 
          OutputTypesUnion, 
          GetAdmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetAdmChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetAdmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetAdmChannelInput, GetAdmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
  }
}
