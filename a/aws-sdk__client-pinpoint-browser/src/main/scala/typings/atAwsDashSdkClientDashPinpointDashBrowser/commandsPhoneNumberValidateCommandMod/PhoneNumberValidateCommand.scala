package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsPhoneNumberValidateCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PhoneNumberValidateCommand", "PhoneNumberValidateCommand")
@js.native
class PhoneNumberValidateCommand protected () extends Command[
      InputTypesUnion, 
      PhoneNumberValidateInput, 
      OutputTypesUnion, 
      PhoneNumberValidateOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: PhoneNumberValidateInput) = this()
  /* CompleteClass */
  override val input: PhoneNumberValidateInput = js.native
  val middlewareStack: MiddlewareStack[PhoneNumberValidateInput, PhoneNumberValidateOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
}

