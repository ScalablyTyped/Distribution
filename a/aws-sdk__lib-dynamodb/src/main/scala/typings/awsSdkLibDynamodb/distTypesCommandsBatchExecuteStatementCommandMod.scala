package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkLibDynamodb.anon.Children
import typings.awsSdkLibDynamodb.anon.OmitBatchStatementRequest
import typings.awsSdkLibDynamodb.anon.OmitBatchStatementRespons
import typings.awsSdkLibDynamodb.distTypesBaseCommandDynamoDBDocumentClientCommandMod.DynamoDBDocumentClientCommand
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClientResolvedConfig
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.ServiceInputTypes
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.ServiceOutputTypes
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod._ServiceInputTypes
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod._ServiceOutputTypes
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsBatchExecuteStatementCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/BatchExecuteStatementCommand", "BatchExecuteStatementCommand")
  @js.native
  open class BatchExecuteStatementCommand protected ()
    extends DynamoDBDocumentClientCommand[
          BatchExecuteStatementCommandInput, 
          BatchExecuteStatementCommandOutput, 
          typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput, 
          typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: BatchExecuteStatementCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_BatchExecuteStatementCommand: typings.awsSdkClientDynamodb.mod.BatchExecuteStatementCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_BatchExecuteStatementCommand: js.Array[Children] = js.native
    
    @JSName("input")
    val input_BatchExecuteStatementCommand: BatchExecuteStatementCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_BatchExecuteStatementCommand: js.Array[Children] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[BatchExecuteStatementCommandInput, BatchExecuteStatementCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[BatchExecuteStatementCommandInput, BatchExecuteStatementCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchExecuteStatementCommandInput, 'Statements'> & {  Statements :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchStatementRequest, 'Parameters'> & {  Parameters :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined} */
  trait BatchExecuteStatementCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var Statements: js.UndefOr[js.Array[OmitBatchStatementRequest]] = js.undefined
  }
  object BatchExecuteStatementCommandInput {
    
    inline def apply(): BatchExecuteStatementCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchExecuteStatementCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchExecuteStatementCommandInput] (val x: Self) extends AnyVal {
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setStatements(value: js.Array[OmitBatchStatementRequest]): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
      
      inline def setStatementsVarargs(value: OmitBatchStatementRequest*): Self = StObject.set(x, "Statements", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchExecuteStatementCommandOutput, 'Responses'> & {  Responses :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchStatementResponse, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined} */
  trait BatchExecuteStatementCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var Responses: js.UndefOr[js.Array[OmitBatchStatementRespons]] = js.undefined
  }
  object BatchExecuteStatementCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchExecuteStatementCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchExecuteStatementCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: js.Array[OmitBatchStatementRespons]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setResponsesVarargs(value: OmitBatchStatementRespons*): Self = StObject.set(x, "Responses", js.Array(value*))
    }
  }
}
