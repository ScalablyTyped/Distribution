package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetApplicationSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApplicationSettingsCommand", "GetApplicationSettingsCommand")
  @js.native
  open class GetApplicationSettingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetApplicationSettingsInput, 
          OutputTypesUnion, 
          GetApplicationSettingsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetApplicationSettingsInput) = this()
    
    /* CompleteClass */
    override val input: GetApplicationSettingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
  }
}
