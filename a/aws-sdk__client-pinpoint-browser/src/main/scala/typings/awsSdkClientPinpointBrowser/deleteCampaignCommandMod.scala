package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
import typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteCampaignCommand", "DeleteCampaignCommand")
  @js.native
  class DeleteCampaignCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCampaignInput, 
          OutputTypesUnion, 
          DeleteCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteCampaignInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
  }
}
