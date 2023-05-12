package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.RestoreTableToPointInTimeInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.RestoreTableToPointInTimeOutput
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

object distTypesCommandsRestoreTableToPointInTimeCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/RestoreTableToPointInTimeCommand", "RestoreTableToPointInTimeCommand")
  @js.native
  open class RestoreTableToPointInTimeCommand protected () extends Command[
          RestoreTableToPointInTimeCommandInput, 
          RestoreTableToPointInTimeCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: RestoreTableToPointInTimeCommandInput) = this()
    
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
    ): Handler[RestoreTableToPointInTimeCommandInput, RestoreTableToPointInTimeCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[RestoreTableToPointInTimeCommandInput, RestoreTableToPointInTimeCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object RestoreTableToPointInTimeCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/RestoreTableToPointInTimeCommand", "RestoreTableToPointInTimeCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type RestoreTableToPointInTimeCommandInput = RestoreTableToPointInTimeInput
  
  trait RestoreTableToPointInTimeCommandOutput
    extends StObject
       with RestoreTableToPointInTimeOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object RestoreTableToPointInTimeCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): RestoreTableToPointInTimeCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableToPointInTimeCommandOutput]
    }
  }
}
