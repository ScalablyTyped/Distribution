package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteCampaignCommand", "DeleteCampaignCommand")
  @js.native
  open class DeleteCampaignCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteCampaignInput, 
          OutputTypesUnion, 
          DeleteCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteCampaignInput) = this()
    
    /* CompleteClass */
    override val input: DeleteCampaignInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteCampaignInput, DeleteCampaignOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
  }
}
