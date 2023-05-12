package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
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

object distTypesCommandsExecuteStatementCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/ExecuteStatementCommand", "ExecuteStatementCommand")
  @js.native
  open class ExecuteStatementCommand protected ()
    extends DynamoDBDocumentClientCommand[
          ExecuteStatementCommandInput, 
          ExecuteStatementCommandOutput, 
          typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput, 
          typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: ExecuteStatementCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_ExecuteStatementCommand: typings.awsSdkClientDynamodb.mod.ExecuteStatementCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_ExecuteStatementCommand: js.Array[Key] = js.native
    
    @JSName("input")
    val input_ExecuteStatementCommand: ExecuteStatementCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_ExecuteStatementCommand: js.Array[Key] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[ExecuteStatementCommandInput, ExecuteStatementCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ExecuteStatementCommandInput, ExecuteStatementCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExecuteStatementCommandInput, 'Parameters'> & {  Parameters :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait ExecuteStatementCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    
    var Limit: js.UndefOr[Double] = js.undefined
    
    var NextToken: js.UndefOr[String] = js.undefined
    
    var Parameters: js.UndefOr[js.Array[NativeAttributeValue]] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var Statement: js.UndefOr[String] = js.undefined
  }
  object ExecuteStatementCommandInput {
    
    inline def apply(): ExecuteStatementCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteStatementCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecuteStatementCommandInput] (val x: Self) extends AnyVal {
      
      inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setParameters(value: js.Array[NativeAttributeValue]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
      
      inline def setParametersVarargs(value: NativeAttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExecuteStatementCommandOutput, 'Items' | 'LastEvaluatedKey'> & {  Items :std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>> | undefined,   LastEvaluatedKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
  trait ExecuteStatementCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
    
    var Items: js.UndefOr[js.Array[Record[String, NativeAttributeValue]]] = js.undefined
    
    var LastEvaluatedKey: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
    
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ExecuteStatementCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteStatementCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecuteStatementCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItems(value: js.Array[Record[String, NativeAttributeValue]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: (Record[String, NativeAttributeValue])*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
