package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateApnsSandboxChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsSandboxChannelCommand", "UpdateApnsSandboxChannelCommand")
  @js.native
  open class UpdateApnsSandboxChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateApnsSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateApnsSandboxChannelInput) = this()
    
    /* CompleteClass */
    override val input: UpdateApnsSandboxChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
  }
}
