package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateAdmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateAdmChannelCommand", "UpdateAdmChannelCommand")
  @js.native
  open class UpdateAdmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateAdmChannelInput, 
          OutputTypesUnion, 
          UpdateAdmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateAdmChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateAdmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
  }
}
