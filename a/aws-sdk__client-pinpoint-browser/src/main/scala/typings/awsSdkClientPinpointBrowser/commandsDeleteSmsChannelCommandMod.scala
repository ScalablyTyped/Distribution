package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteSmsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSmsChannelCommand", "DeleteSmsChannelCommand")
  @js.native
  open class DeleteSmsChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteSmsChannelInput, 
          OutputTypesUnion, 
          DeleteSmsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteSmsChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteSmsChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteSmsChannelInput, DeleteSmsChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSmsChannelInput, DeleteSmsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteSmsChannelInput, DeleteSmsChannelOutput] = js.native
  }
}
