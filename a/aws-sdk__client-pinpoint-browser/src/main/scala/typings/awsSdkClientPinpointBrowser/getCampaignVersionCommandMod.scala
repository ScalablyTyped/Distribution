package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignVersionCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionCommand", "GetCampaignVersionCommand")
  @js.native
  class GetCampaignVersionCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
  }
}
