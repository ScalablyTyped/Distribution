package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteGcmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteGcmChannelCommand", "DeleteGcmChannelCommand")
  @js.native
  class DeleteGcmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteGcmChannelInput, 
          OutputTypesUnion, 
          DeleteGcmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteGcmChannelInput) = this()
    
    /* CompleteClass */
    override val input: DeleteGcmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
  }
}
