package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApplicationSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApplicationSettingsCommand", "GetApplicationSettingsCommand")
  @js.native
  class GetApplicationSettingsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
  }
}
