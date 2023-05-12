package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValue
import typings.awsSdkClientDynamodb.mod.DeleteItemCommand
import typings.awsSdkLibDynamodb.anon.Children
import typings.awsSdkLibDynamodb.anon.ChildrenKey
import typings.awsSdkLibDynamodb.anon.KeyString
import typings.awsSdkLibDynamodb.anon.OmitExpectedAttributeValu
import typings.awsSdkLibDynamodb.anon.OmitItemCollectionMetrics
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

object distTypesCommandsDeleteCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/DeleteCommand", "DeleteCommand")
  @js.native
  open class DeleteCommand protected () extends DynamoDBDocumentClientCommand[
          DeleteCommandInput, 
          DeleteCommandOutput, 
          DeleteItemCommandInput, 
          DeleteItemCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: DeleteCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_DeleteCommand: DeleteItemCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_DeleteCommand: js.Array[KeyString | ChildrenKey] = js.native
    
    @JSName("input")
    val input_DeleteCommand: DeleteCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_DeleteCommand: js.Array[KeyString | Children] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[DeleteCommandInput, DeleteCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteCommandInput, DeleteCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteItemCommandInput, 'Key' | 'Expected' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   Expected :std.Record<string, std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExpectedAttributeValue, 'Value' | 'AttributeValueList'> & {  Value :@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue | undefined,   AttributeValueList :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait DeleteCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ConditionExpression: js.UndefOr[String] = js.undefined
    
    var ConditionalOperator: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator | String
      ] = js.undefined
    
    var Expected: js.UndefOr[Record[String, OmitExpectedAttributeValu]] = js.undefined
    
    var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
    
    var ExpressionAttributeValues: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var Key: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics | String
      ] = js.undefined
    
    var ReturnValues: js.UndefOr[ReturnValue | String] = js.undefined
    
    var TableName: js.UndefOr[String] = js.undefined
  }
  object DeleteCommandInput {
    
    inline def apply(): DeleteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteCommandInput] (val x: Self) extends AnyVal {
      
      inline def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setConditionalOperator(value: ConditionalOperator | String): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setExpected(value: Record[String, OmitExpectedAttributeValu]): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setReturnValues(value: ReturnValue | String): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteItemCommandOutput, 'Attributes' | 'ItemCollectionMetrics'> & {  Attributes :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ItemCollectionMetrics :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemCollectionMetrics, 'ItemCollectionKey'> & {  ItemCollectionKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined} */
  trait DeleteCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var Attributes: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
    
    var ItemCollectionMetrics: js.UndefOr[OmitItemCollectionMetrics] = js.undefined
  }
  object DeleteCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItemCollectionMetrics(value: OmitItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
}
