package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeContributorInsightsInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeContributorInsightsOutput
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

object distTypesCommandsDescribeContributorInsightsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeContributorInsightsCommand", "DescribeContributorInsightsCommand")
  @js.native
  open class DescribeContributorInsightsCommand protected () extends Command[
          DescribeContributorInsightsCommandInput, 
          DescribeContributorInsightsCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeContributorInsightsCommandInput) = this()
    
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
    ): Handler[DescribeContributorInsightsCommandInput, DescribeContributorInsightsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeContributorInsightsCommandInput, DescribeContributorInsightsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeContributorInsightsCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeContributorInsightsCommand", "DescribeContributorInsightsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeContributorInsightsCommandInput = DescribeContributorInsightsInput
  
  trait DescribeContributorInsightsCommandOutput
    extends StObject
       with DescribeContributorInsightsOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeContributorInsightsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeContributorInsightsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContributorInsightsCommandOutput]
    }
  }
}
