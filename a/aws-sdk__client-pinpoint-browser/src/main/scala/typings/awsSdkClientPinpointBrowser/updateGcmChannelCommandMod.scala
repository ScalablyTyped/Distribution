package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGcmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateGcmChannelCommand", "UpdateGcmChannelCommand")
  @js.native
  class UpdateGcmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateGcmChannelInput, 
          OutputTypesUnion, 
          UpdateGcmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateGcmChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateGcmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
  }
}
