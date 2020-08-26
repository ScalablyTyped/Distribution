package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteCampaignCommand", JSImport.Namespace)
@js.native
object deleteCampaignCommandMod extends js.Object {
  @js.native
  class DeleteCampaignCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCampaignInput, 
          OutputTypesUnion, 
          DeleteCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteCampaignInput) = this()
    val middlewareStack: MiddlewareStack[DeleteCampaignInput, DeleteCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
  }
  
}

