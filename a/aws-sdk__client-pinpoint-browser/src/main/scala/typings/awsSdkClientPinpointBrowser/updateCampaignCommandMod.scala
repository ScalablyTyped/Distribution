package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", "UpdateCampaignCommand")
  @js.native
  class UpdateCampaignCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  }
}
