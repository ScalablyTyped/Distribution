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

object distTypesCommandsDisableKinesisStreamingDestinationCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DisableKinesisStreamingDestinationCommand", "DisableKinesisStreamingDestinationCommand")
  @js.native
  open class DisableKinesisStreamingDestinationCommand protected () extends Command[
          DisableKinesisStreamingDestinationCommandInput, 
          DisableKinesisStreamingDestinationCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DisableKinesisStreamingDestinationCommandInput) = this()
    
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
        DisableKinesisStreamingDestinationCommandInput, 
        DisableKinesisStreamingDestinationCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        DisableKinesisStreamingDestinationCommandInput, 
        DisableKinesisStreamingDestinationCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DisableKinesisStreamingDestinationCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DisableKinesisStreamingDestinationCommand", "DisableKinesisStreamingDestinationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DisableKinesisStreamingDestinationCommandInput = KinesisStreamingDestinationInput
  
  trait DisableKinesisStreamingDestinationCommandOutput
    extends StObject
       with KinesisStreamingDestinationOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DisableKinesisStreamingDestinationCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DisableKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableKinesisStreamingDestinationCommandOutput]
    }
  }
}
