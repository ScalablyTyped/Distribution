package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApplicationSettingsCommand", JSImport.Namespace)
@js.native
object updateApplicationSettingsCommandMod extends js.Object {
  @js.native
  class UpdateApplicationSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApplicationSettingsInput, 
          OutputTypesUnion, 
          UpdateApplicationSettingsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApplicationSettingsInput) = this()
    val middlewareStack: MiddlewareStack[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
  }
  
}

