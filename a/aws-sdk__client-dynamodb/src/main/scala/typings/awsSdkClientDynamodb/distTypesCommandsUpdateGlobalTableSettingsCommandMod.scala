package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateGlobalTableSettingsInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateGlobalTableSettingsOutput
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

object distTypesCommandsUpdateGlobalTableSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
  @js.native
  open class UpdateGlobalTableSettingsCommand protected () extends Command[
          UpdateGlobalTableSettingsCommandInput, 
          UpdateGlobalTableSettingsCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateGlobalTableSettingsCommandInput) = this()
    
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
    ): Handler[UpdateGlobalTableSettingsCommandInput, UpdateGlobalTableSettingsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateGlobalTableSettingsCommandInput, UpdateGlobalTableSettingsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateGlobalTableSettingsCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateGlobalTableSettingsCommandInput = UpdateGlobalTableSettingsInput
  
  trait UpdateGlobalTableSettingsCommandOutput
    extends StObject
       with UpdateGlobalTableSettingsOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateGlobalTableSettingsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateGlobalTableSettingsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsCommandOutput]
    }
  }
}
