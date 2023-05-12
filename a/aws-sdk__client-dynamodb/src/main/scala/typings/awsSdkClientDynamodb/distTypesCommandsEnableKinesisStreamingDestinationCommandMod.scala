package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.KinesisStreamingDestinationInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.KinesisStreamingDestinationOutput
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

object distTypesCommandsEnableKinesisStreamingDestinationCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/EnableKinesisStreamingDestinationCommand", "EnableKinesisStreamingDestinationCommand")
  @js.native
  open class EnableKinesisStreamingDestinationCommand protected () extends Command[
          EnableKinesisStreamingDestinationCommandInput, 
          EnableKinesisStreamingDestinationCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: EnableKinesisStreamingDestinationCommandInput) = this()
    
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
        EnableKinesisStreamingDestinationCommandInput, 
        EnableKinesisStreamingDestinationCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        EnableKinesisStreamingDestinationCommandInput, 
        EnableKinesisStreamingDestinationCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object EnableKinesisStreamingDestinationCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/EnableKinesisStreamingDestinationCommand", "EnableKinesisStreamingDestinationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type EnableKinesisStreamingDestinationCommandInput = KinesisStreamingDestinationInput
  
  trait EnableKinesisStreamingDestinationCommandOutput
    extends StObject
       with KinesisStreamingDestinationOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object EnableKinesisStreamingDestinationCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): EnableKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableKinesisStreamingDestinationCommandOutput]
    }
  }
}
