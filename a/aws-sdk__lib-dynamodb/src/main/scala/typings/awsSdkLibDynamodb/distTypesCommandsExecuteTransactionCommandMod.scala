package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkLibDynamodb.anon.Children
import typings.awsSdkLibDynamodb.anon.OmitItemResponseItemItemR
import typings.awsSdkLibDynamodb.anon.OmitParameterizedStatemen
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

object distTypesCommandsExecuteTransactionCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/ExecuteTransactionCommand", "ExecuteTransactionCommand")
  @js.native
  open class ExecuteTransactionCommand protected ()
    extends DynamoDBDocumentClientCommand[
          ExecuteTransactionCommandInput, 
          ExecuteTransactionCommandOutput, 
          typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput, 
          typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: ExecuteTransactionCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_ExecuteTransactionCommand: typings.awsSdkClientDynamodb.mod.ExecuteTransactionCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_ExecuteTransactionCommand: js.Array[Children] = js.native
    
    @JSName("input")
    val input_ExecuteTransactionCommand: ExecuteTransactionCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_ExecuteTransactionCommand: js.Array[Children] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[ExecuteTransactionCommandInput, ExecuteTransactionCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ExecuteTransactionCommandInput, ExecuteTransactionCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExecuteTransactionCommandInput, 'TransactStatements'> & {  TransactStatements :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ParameterizedStatement, 'Parameters'> & {  Parameters :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined} */
  trait ExecuteTransactionCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ClientRequestToken: js.UndefOr[String] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var TransactStatements: js.UndefOr[js.Array[OmitParameterizedStatemen]] = js.undefined
  }
  object ExecuteTransactionCommandInput {
    
    inline def apply(): ExecuteTransactionCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteTransactionCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecuteTransactionCommandInput] (val x: Self) extends AnyVal {
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTransactStatements(value: js.Array[OmitParameterizedStatemen]): Self = StObject.set(x, "TransactStatements", value.asInstanceOf[js.Any])
      
      inline def setTransactStatementsUndefined: Self = StObject.set(x, "TransactStatements", js.undefined)
      
      inline def setTransactStatementsVarargs(value: OmitParameterizedStatemen*): Self = StObject.set(x, "TransactStatements", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExecuteTransactionCommandOutput, 'Responses'> & {  Responses :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemResponse, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined} */
  trait ExecuteTransactionCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var Responses: js.UndefOr[js.Array[OmitItemResponseItemItemR]] = js.undefined
  }
  object ExecuteTransactionCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ExecuteTransactionCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteTransactionCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecuteTransactionCommandOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: js.Array[OmitItemResponseItemItemR]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setResponsesVarargs(value: OmitItemResponseItemItemR*): Self = StObject.set(x, "Responses", js.Array(value*))
    }
  }
}
