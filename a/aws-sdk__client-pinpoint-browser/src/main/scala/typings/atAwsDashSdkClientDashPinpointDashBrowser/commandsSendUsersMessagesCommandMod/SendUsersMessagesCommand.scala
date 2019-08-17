package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsSendUsersMessagesCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendUsersMessagesCommand", "SendUsersMessagesCommand")
@js.native
class SendUsersMessagesCommand protected () extends Command[
      InputTypesUnion, 
      SendUsersMessagesInput, 
      OutputTypesUnion, 
      SendUsersMessagesOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: SendUsersMessagesInput) = this()
  /* CompleteClass */
  override val input: SendUsersMessagesInput = js.native
  val middlewareStack: MiddlewareStack[SendUsersMessagesInput, SendUsersMessagesOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
}

