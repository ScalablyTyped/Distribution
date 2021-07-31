package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignsCommand", "GetCampaignsCommand")
  @js.native
  class GetCampaignsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignsInput, 
          OutputTypesUnion, 
          GetCampaignsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignsInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignsInput, GetCampaignsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
  }
}
