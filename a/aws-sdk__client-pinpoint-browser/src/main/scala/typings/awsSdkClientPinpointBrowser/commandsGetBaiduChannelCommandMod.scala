package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBaiduChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetBaiduChannelCommand", "GetBaiduChannelCommand")
  @js.native
  open class GetBaiduChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBaiduChannelInput, 
          OutputTypesUnion, 
          GetBaiduChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetBaiduChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetBaiduChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
  }
}
