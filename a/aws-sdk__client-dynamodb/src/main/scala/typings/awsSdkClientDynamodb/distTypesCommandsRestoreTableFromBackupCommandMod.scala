package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.RestoreTableFromBackupInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.RestoreTableFromBackupOutput
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

object distTypesCommandsRestoreTableFromBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/RestoreTableFromBackupCommand", "RestoreTableFromBackupCommand")
  @js.native
  open class RestoreTableFromBackupCommand protected () extends Command[
          RestoreTableFromBackupCommandInput, 
          RestoreTableFromBackupCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: RestoreTableFromBackupCommandInput) = this()
    
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
    ): Handler[RestoreTableFromBackupCommandInput, RestoreTableFromBackupCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[RestoreTableFromBackupCommandInput, RestoreTableFromBackupCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object RestoreTableFromBackupCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/RestoreTableFromBackupCommand", "RestoreTableFromBackupCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type RestoreTableFromBackupCommandInput = RestoreTableFromBackupInput
  
  trait RestoreTableFromBackupCommandOutput
    extends StObject
       with RestoreTableFromBackupOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object RestoreTableFromBackupCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): RestoreTableFromBackupCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableFromBackupCommandOutput]
    }
  }
}
