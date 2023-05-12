package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeKinesisStreamingDestinationInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeKinesisStreamingDestinationOutput
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

object distTypesCommandsDescribeKinesisStreamingDestinationCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeKinesisStreamingDestinationCommand", "DescribeKinesisStreamingDestinationCommand")
  @js.native
  open class DescribeKinesisStreamingDestinationCommand protected () extends Command[
          DescribeKinesisStreamingDestinationCommandInput, 
          DescribeKinesisStreamingDestinationCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeKinesisStreamingDestinationCommandInput) = this()
    
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
    ): Handler[
        DescribeKinesisStreamingDestinationCommandInput, 
        DescribeKinesisStreamingDestinationCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        DescribeKinesisStreamingDestinationCommandInput, 
        DescribeKinesisStreamingDestinationCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeKinesisStreamingDestinationCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeKinesisStreamingDestinationCommand", "DescribeKinesisStreamingDestinationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeKinesisStreamingDestinationCommandInput = DescribeKinesisStreamingDestinationInput
  
  trait DescribeKinesisStreamingDestinationCommandOutput
    extends StObject
       with DescribeKinesisStreamingDestinationOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeKinesisStreamingDestinationCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeKinesisStreamingDestinationCommandOutput]
    }
  }
}
