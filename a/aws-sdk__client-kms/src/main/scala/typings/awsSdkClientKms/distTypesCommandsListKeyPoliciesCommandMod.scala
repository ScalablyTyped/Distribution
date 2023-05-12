package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListKeyPoliciesRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListKeyPoliciesResponse
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsListKeyPoliciesCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
  @js.native
  open class ListKeyPoliciesCommand protected () extends Command[
          ListKeyPoliciesCommandInput, 
          ListKeyPoliciesCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ListKeyPoliciesCommandInput) = this()
    
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
    ): Handler[ListKeyPoliciesCommandInput, ListKeyPoliciesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListKeyPoliciesCommandInput, ListKeyPoliciesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListKeyPoliciesCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListKeyPoliciesCommandInput = ListKeyPoliciesRequest
  
  trait ListKeyPoliciesCommandOutput
    extends StObject
       with ListKeyPoliciesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListKeyPoliciesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListKeyPoliciesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListKeyPoliciesCommandOutput]
    }
  }
}
