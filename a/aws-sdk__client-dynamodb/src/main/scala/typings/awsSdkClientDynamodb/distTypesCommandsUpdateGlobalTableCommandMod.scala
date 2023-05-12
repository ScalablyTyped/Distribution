package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateGlobalTableInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateGlobalTableOutput
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

object distTypesCommandsUpdateGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateGlobalTableCommand", "UpdateGlobalTableCommand")
  @js.native
  open class UpdateGlobalTableCommand protected () extends Command[
          UpdateGlobalTableCommandInput, 
          UpdateGlobalTableCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateGlobalTableCommandInput) = this()
    
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
    ): Handler[UpdateGlobalTableCommandInput, UpdateGlobalTableCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateGlobalTableCommandInput, UpdateGlobalTableCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateGlobalTableCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateGlobalTableCommand", "UpdateGlobalTableCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateGlobalTableCommandInput = UpdateGlobalTableInput
  
  trait UpdateGlobalTableCommandOutput
    extends StObject
       with UpdateGlobalTableOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateGlobalTableCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateGlobalTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableCommandOutput]
    }
  }
}
