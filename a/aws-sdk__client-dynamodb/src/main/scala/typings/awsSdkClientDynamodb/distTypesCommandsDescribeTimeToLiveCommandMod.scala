package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeTimeToLiveInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeTimeToLiveOutput
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

object distTypesCommandsDescribeTimeToLiveCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeTimeToLiveCommand", "DescribeTimeToLiveCommand")
  @js.native
  open class DescribeTimeToLiveCommand protected () extends Command[
          DescribeTimeToLiveCommandInput, 
          DescribeTimeToLiveCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeTimeToLiveCommandInput) = this()
    
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
    ): Handler[DescribeTimeToLiveCommandInput, DescribeTimeToLiveCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeTimeToLiveCommandInput, DescribeTimeToLiveCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeTimeToLiveCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeTimeToLiveCommand", "DescribeTimeToLiveCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeTimeToLiveCommandInput = DescribeTimeToLiveInput
  
  trait DescribeTimeToLiveCommandOutput
    extends StObject
       with DescribeTimeToLiveOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeTimeToLiveCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeTimeToLiveCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTimeToLiveCommandOutput]
    }
  }
}
