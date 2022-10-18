package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCampaignsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignsCommand", "GetCampaignsCommand")
  @js.native
  open class GetCampaignsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
  }
}
