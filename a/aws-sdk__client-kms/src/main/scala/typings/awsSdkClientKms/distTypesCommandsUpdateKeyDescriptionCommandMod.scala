package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.UpdateKeyDescriptionRequest
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsUpdateKeyDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
  @js.native
  open class UpdateKeyDescriptionCommand protected () extends Command[
          UpdateKeyDescriptionCommandInput, 
          UpdateKeyDescriptionCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateKeyDescriptionCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig
    ): Handler[UpdateKeyDescriptionCommandInput, UpdateKeyDescriptionCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateKeyDescriptionCommandInput, UpdateKeyDescriptionCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateKeyDescriptionCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateKeyDescriptionCommandInput = UpdateKeyDescriptionRequest
  
  type UpdateKeyDescriptionCommandOutput = MetadataBearer
}
