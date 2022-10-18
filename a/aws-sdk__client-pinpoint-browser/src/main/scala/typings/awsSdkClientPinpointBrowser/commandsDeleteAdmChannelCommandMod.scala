package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteAdmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAdmChannelCommand", "DeleteAdmChannelCommand")
  @js.native
  open class DeleteAdmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteAdmChannelInput, 
          OutputTypesUnion, 
          DeleteAdmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteAdmChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteAdmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteAdmChannelInput, DeleteAdmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAdmChannelInput, DeleteAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteAdmChannelInput, DeleteAdmChannelOutput] = js.native
  }
}
