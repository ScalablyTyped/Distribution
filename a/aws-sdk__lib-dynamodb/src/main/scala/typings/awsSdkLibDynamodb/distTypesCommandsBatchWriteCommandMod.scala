package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics
import typings.awsSdkClientDynamodb.mod.BatchWriteItemCommand
import typings.awsSdkLibDynamodb.anon.Children0
import typings.awsSdkLibDynamodb.anon.ChildrenKey
import typings.awsSdkLibDynamodb.anon.OmitItemCollectionMetrics
import typings.awsSdkLibDynamodb.anon.OmitWriteRequestPutReques
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsBatchWriteCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/BatchWriteCommand", "BatchWriteCommand")
  @js.native
  open class BatchWriteCommand protected () extends DynamoDBDocumentClientCommand[
          BatchWriteCommandInput, 
          BatchWriteCommandOutput, 
          BatchWriteItemCommandInput, 
          BatchWriteItemCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: BatchWriteCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_BatchWriteCommand: BatchWriteItemCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_BatchWriteCommand: js.Array[Children0] = js.native
    
    @JSName("input")
    val input_BatchWriteCommand: BatchWriteCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_BatchWriteCommand: js.Array[Children0 | ChildrenKey] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[BatchWriteCommandInput, BatchWriteCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[BatchWriteCommandInput, BatchWriteCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchWriteItemCommandInput, 'RequestItems'> & {  RequestItems :std.Record<string, std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.WriteRequest, 'PutRequest' | 'DeleteRequest'> & {  PutRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.PutRequest, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   DeleteRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteRequest, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined}>> | undefined} */
  trait BatchWriteCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var RequestItems: js.UndefOr[Record[String, js.Array[OmitWriteRequestPutReques]]] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics | String
      ] = js.undefined
  }
  object BatchWriteCommandInput {
    
    inline def apply(): BatchWriteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchWriteCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchWriteCommandInput] (val x: Self) extends AnyVal {
      
      inline def setRequestItems(value: Record[String, js.Array[OmitWriteRequestPutReques]]): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      inline def setRequestItemsUndefined: Self = StObject.set(x, "RequestItems", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchWriteItemCommandOutput, 'UnprocessedItems' | 'ItemCollectionMetrics'> & {  UnprocessedItems :std.Record<string, std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.WriteRequest, 'PutRequest' | 'DeleteRequest'> & {  PutRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.PutRequest, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   DeleteRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteRequest, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined}>> | undefined,   ItemCollectionMetrics :std.Record<string, std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemCollectionMetrics, 'ItemCollectionKey'> & {  ItemCollectionKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}>> | undefined} */
  trait BatchWriteCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var ItemCollectionMetrics: js.UndefOr[Record[String, js.Array[OmitItemCollectionMetrics]]] = js.undefined
    
    var UnprocessedItems: js.UndefOr[Record[String, js.Array[OmitWriteRequestPutReques]]] = js.undefined
  }
  object BatchWriteCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchWriteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWriteCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchWriteCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setItemCollectionMetrics(value: Record[String, js.Array[OmitItemCollectionMetrics]]): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
      
      inline def setUnprocessedItems(value: Record[String, js.Array[OmitWriteRequestPutReques]]): Self = StObject.set(x, "UnprocessedItems", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedItemsUndefined: Self = StObject.set(x, "UnprocessedItems", js.undefined)
    }
  }
}
