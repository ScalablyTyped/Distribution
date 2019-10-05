package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionsCommand", JSImport.Namespace)
@js.native
object commandsGetCampaignVersionsCommandMod extends js.Object {
  @js.native
  class GetCampaignVersionsCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignVersionsInput, 
          OutputTypesUnion, 
          GetCampaignVersionsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignVersionsInput) = this()
    /* CompleteClass */
    override val input: GetCampaignVersionsInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignVersionsInput, GetCampaignVersionsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
  }
  
}

