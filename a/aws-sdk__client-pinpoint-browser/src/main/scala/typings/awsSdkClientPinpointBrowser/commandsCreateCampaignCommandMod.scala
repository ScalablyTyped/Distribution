package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
import typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateCampaignCommand", "CreateCampaignCommand")
  @js.native
  open class CreateCampaignCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateCampaignInput, 
          OutputTypesUnion, 
          CreateCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateCampaignInput) = this()
    
    /* CompleteClass */
    override val input: CreateCampaignInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateCampaignInput, CreateCampaignOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
  }
}
