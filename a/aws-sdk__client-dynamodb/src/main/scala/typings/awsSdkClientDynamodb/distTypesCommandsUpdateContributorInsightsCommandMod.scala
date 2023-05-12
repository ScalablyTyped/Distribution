package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateContributorInsightsInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateContributorInsightsOutput
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

object distTypesCommandsUpdateContributorInsightsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateContributorInsightsCommand", "UpdateContributorInsightsCommand")
  @js.native
  open class UpdateContributorInsightsCommand protected () extends Command[
          UpdateContributorInsightsCommandInput, 
          UpdateContributorInsightsCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateContributorInsightsCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig
    ): Handler[UpdateContributorInsightsCommandInput, UpdateContributorInsightsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateContributorInsightsCommandInput, UpdateContributorInsightsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateContributorInsightsCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateContributorInsightsCommand", "UpdateContributorInsightsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateContributorInsightsCommandInput = UpdateContributorInsightsInput
  
  trait UpdateContributorInsightsCommandOutput
    extends StObject
       with UpdateContributorInsightsOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateContributorInsightsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateContributorInsightsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContributorInsightsCommandOutput]
    }
  }
}
