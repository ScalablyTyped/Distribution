package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BatchExecuteStatementInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BatchExecuteStatementOutput
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

object distTypesCommandsBatchExecuteStatementCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/BatchExecuteStatementCommand", "BatchExecuteStatementCommand")
  @js.native
  open class BatchExecuteStatementCommand protected () extends Command[
          BatchExecuteStatementCommandInput, 
          BatchExecuteStatementCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: BatchExecuteStatementCommandInput) = this()
    
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
    ): Handler[BatchExecuteStatementCommandInput, BatchExecuteStatementCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[BatchExecuteStatementCommandInput, BatchExecuteStatementCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object BatchExecuteStatementCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/BatchExecuteStatementCommand", "BatchExecuteStatementCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type BatchExecuteStatementCommandInput = BatchExecuteStatementInput
  
  trait BatchExecuteStatementCommandOutput
    extends StObject
       with BatchExecuteStatementOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object BatchExecuteStatementCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchExecuteStatementCommandOutput]
    }
  }
}
