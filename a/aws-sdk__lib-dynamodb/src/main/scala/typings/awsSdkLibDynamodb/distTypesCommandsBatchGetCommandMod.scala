package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.mod.BatchGetItemCommand
import typings.awsSdkLibDynamodb.anon.ChildrenChildrenUndefined
import typings.awsSdkLibDynamodb.anon.ChildrenKey
import typings.awsSdkLibDynamodb.anon.OmitKeysAndAttributesKeys
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
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsBatchGetCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/BatchGetCommand", "BatchGetCommand")
  @js.native
  open class BatchGetCommand protected () extends DynamoDBDocumentClientCommand[
          BatchGetCommandInput, 
          BatchGetCommandOutput, 
          BatchGetItemCommandInput, 
          BatchGetItemCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: BatchGetCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_BatchGetCommand: BatchGetItemCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_BatchGetCommand: js.Array[ChildrenKey] = js.native
    
    @JSName("input")
    val input_BatchGetCommand: BatchGetCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_BatchGetCommand: js.Array[ChildrenChildrenUndefined | ChildrenKey] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[BatchGetCommandInput, BatchGetCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[BatchGetCommandInput, BatchGetCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchGetItemCommandInput, 'RequestItems'> & {  RequestItems :std.Record<string, std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.KeysAndAttributes, 'Keys'> & {  Keys :std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>> | undefined}> | undefined} */
  trait BatchGetCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var RequestItems: js.UndefOr[Record[String, OmitKeysAndAttributesKeys]] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
  }
  object BatchGetCommandInput {
    
    inline def apply(): BatchGetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchGetCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetCommandInput] (val x: Self) extends AnyVal {
      
      inline def setRequestItems(value: Record[String, OmitKeysAndAttributesKeys]): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      inline def setRequestItemsUndefined: Self = StObject.set(x, "RequestItems", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchGetItemCommandOutput, 'Responses' | 'UnprocessedKeys'> & {  Responses :std.Record<string, std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>>> | undefined,   UnprocessedKeys :std.Record<string, std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.KeysAndAttributes, 'Keys'> & {  Keys :std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>> | undefined}> | undefined} */
  trait BatchGetCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var Responses: js.UndefOr[Record[String, js.Array[Record[String, NativeAttributeValue]]]] = js.undefined
    
    var UnprocessedKeys: js.UndefOr[Record[String, OmitKeysAndAttributesKeys]] = js.undefined
  }
  object BatchGetCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchGetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: Record[String, js.Array[Record[String, NativeAttributeValue]]]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setUnprocessedKeys(value: Record[String, OmitKeysAndAttributesKeys]): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    }
  }
}
