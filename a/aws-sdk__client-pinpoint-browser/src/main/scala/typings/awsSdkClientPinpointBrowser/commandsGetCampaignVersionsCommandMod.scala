package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCampaignVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionsCommand", "GetCampaignVersionsCommand")
  @js.native
  open class GetCampaignVersionsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignVersionsInput, 
          OutputTypesUnion, 
          GetCampaignVersionsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignVersionsInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignVersionsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
  }
}
