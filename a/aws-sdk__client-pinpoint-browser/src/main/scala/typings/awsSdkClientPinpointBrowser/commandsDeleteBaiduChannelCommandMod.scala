package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBaiduChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteBaiduChannelCommand", "DeleteBaiduChannelCommand")
  @js.native
  open class DeleteBaiduChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBaiduChannelInput, 
          OutputTypesUnion, 
          DeleteBaiduChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteBaiduChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBaiduChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
  }
}
