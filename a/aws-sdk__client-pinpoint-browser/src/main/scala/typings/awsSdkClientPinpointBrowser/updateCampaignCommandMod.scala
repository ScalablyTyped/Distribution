package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", JSImport.Namespace)
@js.native
object updateCampaignCommandMod extends js.Object {
  @js.native
  class UpdateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCampaignInput, 
          OutputTypesUnion, 
          UpdateCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateCampaignInput) = this()
    /* CompleteClass */
    override val input: UpdateCampaignInput = js.native
    val middlewareStack: MiddlewareStack[UpdateCampaignInput, UpdateCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  }
  
}

