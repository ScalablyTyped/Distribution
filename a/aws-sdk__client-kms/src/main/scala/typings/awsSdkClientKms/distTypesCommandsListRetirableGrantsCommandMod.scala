package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListGrantsResponse
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListRetirableGrantsRequest
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

object distTypesCommandsListRetirableGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
  @js.native
  open class ListRetirableGrantsCommand protected () extends Command[
          ListRetirableGrantsCommandInput, 
          ListRetirableGrantsCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ListRetirableGrantsCommandInput) = this()
    
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
    ): Handler[ListRetirableGrantsCommandInput, ListRetirableGrantsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListRetirableGrantsCommandInput, ListRetirableGrantsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListRetirableGrantsCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListRetirableGrantsCommandInput = ListRetirableGrantsRequest
  
  trait ListRetirableGrantsCommandOutput
    extends StObject
       with ListGrantsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListRetirableGrantsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListRetirableGrantsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRetirableGrantsCommandOutput]
    }
  }
}
