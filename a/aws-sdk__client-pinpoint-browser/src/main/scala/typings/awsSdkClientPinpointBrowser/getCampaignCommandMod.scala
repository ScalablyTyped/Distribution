package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignCommand", "GetCampaignCommand")
  @js.native
  class GetCampaignCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignInput, 
          OutputTypesUnion, 
          GetCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignInput, GetCampaignOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
  }
}
