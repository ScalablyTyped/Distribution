package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignActivitiesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignActivitiesCommand", "GetCampaignActivitiesCommand")
  @js.native
  class GetCampaignActivitiesCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
  }
}
