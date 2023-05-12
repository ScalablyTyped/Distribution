package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListAliasesRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ListAliasesResponse
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

object distTypesCommandsListAliasesCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ListAliasesCommand", "ListAliasesCommand")
  @js.native
  open class ListAliasesCommand protected () extends Command[ListAliasesCommandInput, ListAliasesCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: ListAliasesCommandInput) = this()
    
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
    ): Handler[ListAliasesCommandInput, ListAliasesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListAliasesCommandInput, ListAliasesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListAliasesCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ListAliasesCommand", "ListAliasesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListAliasesCommandInput = ListAliasesRequest
  
  trait ListAliasesCommandOutput
    extends StObject
       with ListAliasesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListAliasesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAliasesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAliasesCommandOutput]
    }
  }
}
