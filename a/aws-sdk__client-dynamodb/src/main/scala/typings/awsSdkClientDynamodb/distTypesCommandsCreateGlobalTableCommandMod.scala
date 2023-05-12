package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.CreateGlobalTableInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.CreateGlobalTableOutput
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

object distTypesCommandsCreateGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/CreateGlobalTableCommand", "CreateGlobalTableCommand")
  @js.native
  open class CreateGlobalTableCommand protected () extends Command[
          CreateGlobalTableCommandInput, 
          CreateGlobalTableCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: CreateGlobalTableCommandInput) = this()
    
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
    ): Handler[CreateGlobalTableCommandInput, CreateGlobalTableCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateGlobalTableCommandInput, CreateGlobalTableCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CreateGlobalTableCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/CreateGlobalTableCommand", "CreateGlobalTableCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CreateGlobalTableCommandInput = CreateGlobalTableInput
  
  trait CreateGlobalTableCommandOutput
    extends StObject
       with CreateGlobalTableOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object CreateGlobalTableCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateGlobalTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalTableCommandOutput]
    }
  }
}
