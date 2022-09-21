package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
import typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEmailChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEmailChannelCommand", "GetEmailChannelCommand")
  @js.native
  open class GetEmailChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetEmailChannelInput, 
          OutputTypesUnion, 
          GetEmailChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEmailChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetEmailChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetEmailChannelInput, GetEmailChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEmailChannelInput, GetEmailChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetEmailChannelInput, GetEmailChannelOutput] = js.native
  }
}
