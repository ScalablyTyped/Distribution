package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DescribeCustomKeyStoresRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DescribeCustomKeyStoresResponse
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

object distTypesCommandsDescribeCustomKeyStoresCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/DescribeCustomKeyStoresCommand", "DescribeCustomKeyStoresCommand")
  @js.native
  open class DescribeCustomKeyStoresCommand protected () extends Command[
          DescribeCustomKeyStoresCommandInput, 
          DescribeCustomKeyStoresCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeCustomKeyStoresCommandInput) = this()
    
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
    ): Handler[DescribeCustomKeyStoresCommandInput, DescribeCustomKeyStoresCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeCustomKeyStoresCommandInput, DescribeCustomKeyStoresCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeCustomKeyStoresCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/DescribeCustomKeyStoresCommand", "DescribeCustomKeyStoresCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeCustomKeyStoresCommandInput = DescribeCustomKeyStoresRequest
  
  trait DescribeCustomKeyStoresCommandOutput
    extends StObject
       with DescribeCustomKeyStoresResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeCustomKeyStoresCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeCustomKeyStoresCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeCustomKeyStoresCommandOutput]
    }
  }
}
