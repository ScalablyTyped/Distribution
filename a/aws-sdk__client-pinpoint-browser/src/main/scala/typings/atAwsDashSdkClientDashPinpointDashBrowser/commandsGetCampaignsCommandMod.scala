package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignsInputMod.GetCampaignsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignsCommand", JSImport.Namespace)
@js.native
object commandsGetCampaignsCommandMod extends js.Object {
  @js.native
  class GetCampaignsCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignsInput, 
          OutputTypesUnion, 
          GetCampaignsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignsInput) = this()
    /* CompleteClass */
    override val input: GetCampaignsInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignsInput, GetCampaignsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
  }
  
}

