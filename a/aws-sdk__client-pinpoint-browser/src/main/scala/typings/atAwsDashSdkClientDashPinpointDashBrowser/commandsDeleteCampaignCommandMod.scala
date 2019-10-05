package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteCampaignCommand", JSImport.Namespace)
@js.native
object commandsDeleteCampaignCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: DeleteCampaignInput = js.native
    val middlewareStack: MiddlewareStack[DeleteCampaignInput, DeleteCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
  }
  
}

