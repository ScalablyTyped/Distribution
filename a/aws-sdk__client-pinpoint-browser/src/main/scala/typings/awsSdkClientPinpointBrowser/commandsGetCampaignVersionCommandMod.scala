package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCampaignVersionCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionCommand", "GetCampaignVersionCommand")
  @js.native
  open class GetCampaignVersionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignVersionInput, 
          OutputTypesUnion, 
          GetCampaignVersionOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignVersionInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignVersionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
  }
}
