package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.CreateTableInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.CreateTableOutput
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

object distTypesCommandsCreateTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/CreateTableCommand", "CreateTableCommand")
  @js.native
  open class CreateTableCommand protected () extends Command[
          CreateTableCommandInput, 
          CreateTableCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: CreateTableCommandInput) = this()
    
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
    ): Handler[CreateTableCommandInput, CreateTableCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateTableCommandInput, CreateTableCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CreateTableCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/CreateTableCommand", "CreateTableCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CreateTableCommandInput = CreateTableInput
  
  trait CreateTableCommandOutput
    extends StObject
       with CreateTableOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object CreateTableCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTableCommandOutput]
    }
  }
}
