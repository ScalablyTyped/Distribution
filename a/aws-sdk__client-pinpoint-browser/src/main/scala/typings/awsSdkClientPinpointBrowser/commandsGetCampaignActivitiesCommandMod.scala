package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCampaignActivitiesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignActivitiesCommand", "GetCampaignActivitiesCommand")
  @js.native
  open class GetCampaignActivitiesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignActivitiesInput, 
          OutputTypesUnion, 
          GetCampaignActivitiesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignActivitiesInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignActivitiesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
  }
}
