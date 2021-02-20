package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSmsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSmsChannelCommand", "GetSmsChannelCommand")
  @js.native
  class GetSmsChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetSmsChannelInput, 
          OutputTypesUnion, 
          GetSmsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSmsChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
  }
}
