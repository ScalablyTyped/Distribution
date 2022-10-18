package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
import typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPhoneNumberValidateCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/PhoneNumberValidateCommand", "PhoneNumberValidateCommand")
  @js.native
  open class PhoneNumberValidateCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PhoneNumberValidateInput, 
          OutputTypesUnion, 
          PhoneNumberValidateOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: PhoneNumberValidateInput) = this()
    
    /* CompleteClass */
    override val input: PhoneNumberValidateInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
  }
}
