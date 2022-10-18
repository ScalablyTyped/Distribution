package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateBaiduChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateBaiduChannelCommand", "UpdateBaiduChannelCommand")
  @js.native
  open class UpdateBaiduChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateBaiduChannelInput, 
          OutputTypesUnion, 
          UpdateBaiduChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateBaiduChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateBaiduChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateBaiduChannelInput, UpdateBaiduChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateBaiduChannelInput, UpdateBaiduChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateBaiduChannelInput, UpdateBaiduChannelOutput] = js.native
  }
}
