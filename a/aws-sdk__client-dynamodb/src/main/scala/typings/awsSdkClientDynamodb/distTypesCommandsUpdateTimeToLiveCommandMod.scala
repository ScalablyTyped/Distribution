package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateTimeToLiveInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateTimeToLiveOutput
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

object distTypesCommandsUpdateTimeToLiveCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateTimeToLiveCommand", "UpdateTimeToLiveCommand")
  @js.native
  open class UpdateTimeToLiveCommand protected () extends Command[
          UpdateTimeToLiveCommandInput, 
          UpdateTimeToLiveCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateTimeToLiveCommandInput) = this()
    
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
    ): Handler[UpdateTimeToLiveCommandInput, UpdateTimeToLiveCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateTimeToLiveCommandInput, UpdateTimeToLiveCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateTimeToLiveCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateTimeToLiveCommand", "UpdateTimeToLiveCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateTimeToLiveCommandInput = UpdateTimeToLiveInput
  
  trait UpdateTimeToLiveCommandOutput
    extends StObject
       with UpdateTimeToLiveOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateTimeToLiveCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateTimeToLiveCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTimeToLiveCommandOutput]
    }
  }
}
