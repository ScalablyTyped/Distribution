package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEmailChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEmailChannelCommand", "GetEmailChannelCommand")
  @js.native
  class GetEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetEmailChannelInput, 
          OutputTypesUnion, 
          GetEmailChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEmailChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEmailChannelInput, GetEmailChannelOutput] = js.native
  }
}
