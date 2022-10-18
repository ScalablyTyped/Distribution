package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateApplicationSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApplicationSettingsCommand", "UpdateApplicationSettingsCommand")
  @js.native
  open class UpdateApplicationSettingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateApplicationSettingsInput, 
          OutputTypesUnion, 
          UpdateApplicationSettingsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateApplicationSettingsInput) = this()
    
    /* CompleteClass */
    override val input: UpdateApplicationSettingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
  }
}
