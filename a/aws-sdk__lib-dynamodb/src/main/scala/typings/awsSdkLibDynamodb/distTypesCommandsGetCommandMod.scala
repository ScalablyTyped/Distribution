package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.mod.GetItemCommand
import typings.awsSdkLibDynamodb.anon.Key
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

object distTypesCommandsGetCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/GetCommand", "GetCommand")
  @js.native
  open class GetCommand protected () extends DynamoDBDocumentClientCommand[
          GetCommandInput, 
          GetCommandOutput, 
          GetItemCommandInput, 
          GetItemCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: GetCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_GetCommand: GetItemCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_GetCommand: js.Array[Key] = js.native
    
    @JSName("input")
    val input_GetCommand: GetCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_GetCommand: js.Array[Key] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[GetCommandInput, GetCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCommandInput, GetCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.GetItemCommandInput, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait GetCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
    
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    
    var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
    
    var Key: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var ProjectionExpression: js.UndefOr[String] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var TableName: js.UndefOr[String] = js.undefined
  }
  object GetCommandInput {
    
    inline def apply(): GetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCommandInput] (val x: Self) extends AnyVal {
      
      inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.GetItemCommandOutput, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait GetCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
    
    var Item: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  }
  object GetCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItem(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    }
  }
}
