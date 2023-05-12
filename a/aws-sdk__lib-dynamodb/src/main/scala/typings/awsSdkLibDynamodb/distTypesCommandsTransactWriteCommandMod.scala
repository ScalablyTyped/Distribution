package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics
import typings.awsSdkClientDynamodb.mod.TransactWriteItemsCommand
import typings.awsSdkLibDynamodb.anon.ChildrenArrayKeyString
import typings.awsSdkLibDynamodb.anon.ChildrenKey
import typings.awsSdkLibDynamodb.anon.OmitItemCollectionMetrics
import typings.awsSdkLibDynamodb.anon.OmitTransactWriteItemCond
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

object distTypesCommandsTransactWriteCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/TransactWriteCommand", "TransactWriteCommand")
  @js.native
  open class TransactWriteCommand protected () extends DynamoDBDocumentClientCommand[
          TransactWriteCommandInput, 
          TransactWriteCommandOutput, 
          TransactWriteItemsCommandInput, 
          TransactWriteItemsCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: TransactWriteCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_TransactWriteCommand: TransactWriteItemsCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_TransactWriteCommand: js.Array[ChildrenArrayKeyString] = js.native
    
    @JSName("input")
    val input_TransactWriteCommand: TransactWriteCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_TransactWriteCommand: js.Array[ChildrenKey] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[TransactWriteCommandInput, TransactWriteCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[TransactWriteCommandInput, TransactWriteCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactWriteItemsCommandInput, 'TransactItems'> & {  TransactItems :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactWriteItem, 'ConditionCheck' | 'Put' | 'Delete' | 'Update'> & {  ConditionCheck :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ConditionCheck, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Put :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Put, 'Item' | 'ExpressionAttributeValues'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Delete :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Delete, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Update :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Update, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined}> | undefined} */
  trait TransactWriteCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ClientRequestToken: js.UndefOr[String] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics | String
      ] = js.undefined
    
    var TransactItems: js.UndefOr[js.Array[OmitTransactWriteItemCond]] = js.undefined
  }
  object TransactWriteCommandInput {
    
    inline def apply(): TransactWriteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactWriteCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactWriteCommandInput] (val x: Self) extends AnyVal {
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setTransactItems(value: js.Array[OmitTransactWriteItemCond]): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      inline def setTransactItemsUndefined: Self = StObject.set(x, "TransactItems", js.undefined)
      
      inline def setTransactItemsVarargs(value: OmitTransactWriteItemCond*): Self = StObject.set(x, "TransactItems", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactWriteItemsCommandOutput, 'ItemCollectionMetrics'> & {  ItemCollectionMetrics :std.Record<string, std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemCollectionMetrics, 'ItemCollectionKey'> & {  ItemCollectionKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}>> | undefined} */
  trait TransactWriteCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var ItemCollectionMetrics: js.UndefOr[Record[String, js.Array[OmitItemCollectionMetrics]]] = js.undefined
  }
  object TransactWriteCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): TransactWriteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactWriteCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactWriteCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setItemCollectionMetrics(value: Record[String, js.Array[OmitItemCollectionMetrics]]): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
}
