package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
import typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApplicationSettingsCommand", JSImport.Namespace)
@js.native
object getApplicationSettingsCommandMod extends js.Object {
  @js.native
  class GetApplicationSettingsCommand protected () extends Command[
          InputTypesUnion, 
          GetApplicationSettingsInput, 
          OutputTypesUnion, 
          GetApplicationSettingsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApplicationSettingsInput) = this()
    val middlewareStack: MiddlewareStack[GetApplicationSettingsInput, GetApplicationSettingsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
  }
  
}

