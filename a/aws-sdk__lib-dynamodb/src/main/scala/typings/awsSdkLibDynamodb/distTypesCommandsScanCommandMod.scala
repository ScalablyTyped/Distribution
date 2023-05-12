package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Select
import typings.awsSdkLibDynamodb.anon.ChildrenKey
import typings.awsSdkLibDynamodb.anon.Key
import typings.awsSdkLibDynamodb.anon.KeyString
import typings.awsSdkLibDynamodb.anon.OmitConditionAttributeVal
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

object distTypesCommandsScanCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/ScanCommand", "ScanCommand")
  @js.native
  open class ScanCommand protected ()
    extends DynamoDBDocumentClientCommand[
          ScanCommandInput, 
          ScanCommandOutput, 
          typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput, 
          typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: ScanCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_ScanCommand: typings.awsSdkClientDynamodb.mod.ScanCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_ScanCommand: js.Array[ChildrenKey | KeyString] = js.native
    
    @JSName("input")
    val input_ScanCommand: ScanCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_ScanCommand: js.Array[Key] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[ScanCommandInput, ScanCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ScanCommandInput, ScanCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ScanCommandInput, 'ScanFilter' | 'ExclusiveStartKey' | 'ExpressionAttributeValues'> & {  ScanFilter :std.Record<string, std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Condition, 'AttributeValueList'> & {  AttributeValueList :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined,   ExclusiveStartKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait ScanCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
    
    var ConditionalOperator: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator | String
      ] = js.undefined
    
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    
    var ExclusiveStartKey: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
    
    var ExpressionAttributeValues: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var FilterExpression: js.UndefOr[String] = js.undefined
    
    var IndexName: js.UndefOr[String] = js.undefined
    
    var Limit: js.UndefOr[Double] = js.undefined
    
    var ProjectionExpression: js.UndefOr[String] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var ScanFilter: js.UndefOr[Record[String, OmitConditionAttributeVal]] = js.undefined
    
    var Segment: js.UndefOr[Double] = js.undefined
    
    var Select: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Select | String] = js.undefined
    
    var TableName: js.UndefOr[String] = js.undefined
    
    var TotalSegments: js.UndefOr[Double] = js.undefined
  }
  object ScanCommandInput {
    
    inline def apply(): ScanCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanCommandInput] (val x: Self) extends AnyVal {
      
      inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConditionalOperator(value: ConditionalOperator | String): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExclusiveStartKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
      
      inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setScanFilter(value: Record[String, OmitConditionAttributeVal]): Self = StObject.set(x, "ScanFilter", value.asInstanceOf[js.Any])
      
      inline def setScanFilterUndefined: Self = StObject.set(x, "ScanFilter", js.undefined)
      
      inline def setSegment(value: Double): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
      
      inline def setSelect(value: Select | String): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTotalSegments(value: Double): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
      
      inline def setTotalSegmentsUndefined: Self = StObject.set(x, "TotalSegments", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ScanCommandOutput, 'Items' | 'LastEvaluatedKey'> & {  Items :std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>> | undefined,   LastEvaluatedKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait ScanCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
    
    var Count: js.UndefOr[Double] = js.undefined
    
    var Items: js.UndefOr[js.Array[Record[String, NativeAttributeValue]]] = js.undefined
    
    var LastEvaluatedKey: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var ScannedCount: js.UndefOr[Double] = js.undefined
  }
  object ScanCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ScanCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      inline def setItems(value: js.Array[Record[String, NativeAttributeValue]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: (Record[String, NativeAttributeValue])*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
}
