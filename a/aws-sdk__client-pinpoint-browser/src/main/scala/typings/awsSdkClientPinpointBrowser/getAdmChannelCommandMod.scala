package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAdmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAdmChannelCommand", "GetAdmChannelCommand")
  @js.native
  class GetAdmChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetAdmChannelInput, 
          OutputTypesUnion, 
          GetAdmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetAdmChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
  }
}
