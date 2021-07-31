package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateSmsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSmsChannelCommand", "UpdateSmsChannelCommand")
  @js.native
  class UpdateSmsChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateSmsChannelInput, 
          OutputTypesUnion, 
          UpdateSmsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateSmsChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateSmsChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
  }
}
