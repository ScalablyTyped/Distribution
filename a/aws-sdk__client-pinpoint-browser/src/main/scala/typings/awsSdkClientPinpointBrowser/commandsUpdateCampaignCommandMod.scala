package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", "UpdateCampaignCommand")
  @js.native
  open class UpdateCampaignCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateCampaignInput, 
          OutputTypesUnion, 
          UpdateCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateCampaignInput) = this()
    
    /* CompleteClass */
    override val input: UpdateCampaignInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateCampaignInput, UpdateCampaignOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  }
}
