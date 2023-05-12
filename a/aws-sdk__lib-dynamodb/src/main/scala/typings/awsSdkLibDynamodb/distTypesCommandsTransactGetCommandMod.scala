package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandOutput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.mod.TransactGetItemsCommand
import typings.awsSdkLibDynamodb.anon.Children
import typings.awsSdkLibDynamodb.anon.ChildrenArrayKeyString
import typings.awsSdkLibDynamodb.anon.OmitItemResponseItemItemR
import typings.awsSdkLibDynamodb.anon.OmitTransactGetItemGetGet
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

object distTypesCommandsTransactGetCommandMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/TransactGetCommand", "TransactGetCommand")
  @js.native
  open class TransactGetCommand protected () extends DynamoDBDocumentClientCommand[
          TransactGetCommandInput, 
          TransactGetCommandOutput, 
          TransactGetItemsCommandInput, 
          TransactGetItemsCommandOutput, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    def this(input: TransactGetCommandInput) = this()
    
    /* protected */ @JSName("clientCommand")
    val clientCommand_TransactGetCommand: TransactGetItemsCommand = js.native
    
    /* protected */ @JSName("inputKeyNodes")
    val inputKeyNodes_TransactGetCommand: js.Array[ChildrenArrayKeyString] = js.native
    
    @JSName("input")
    val input_TransactGetCommand: TransactGetCommandInput = js.native
    
    /* protected */ @JSName("outputKeyNodes")
    val outputKeyNodes_TransactGetCommand: js.Array[Children] = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig
    ): Handler[TransactGetCommandInput, TransactGetCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBDocumentClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[TransactGetCommandInput, TransactGetCommandOutput] = js.native
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactGetItemsCommandInput, 'TransactItems'> & {  TransactItems :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactGetItem, 'Get'> & {  Get :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Get, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined}> | undefined} */
  trait TransactGetCommandInput
    extends StObject
       with _ServiceInputTypes {
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
      ] = js.undefined
    
    var TransactItems: js.UndefOr[js.Array[OmitTransactGetItemGetGet]] = js.undefined
  }
  object TransactGetCommandInput {
    
    inline def apply(): TransactGetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactGetCommandInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactGetCommandInput] (val x: Self) extends AnyVal {
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTransactItems(value: js.Array[OmitTransactGetItemGetGet]): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      inline def setTransactItemsUndefined: Self = StObject.set(x, "TransactItems", js.undefined)
      
      inline def setTransactItemsVarargs(value: OmitTransactGetItemGetGet*): Self = StObject.set(x, "TransactItems", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactGetItemsCommandOutput, 'Responses'> & {  Responses :std.Array<std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemResponse, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined}> | undefined} */
  trait TransactGetCommandOutput
    extends StObject
       with _ServiceOutputTypes {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var ConsumedCapacity: js.UndefOr[
        js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
      ] = js.undefined
    
    var Responses: js.UndefOr[js.Array[OmitItemResponseItemItemR]] = js.undefined
  }
  object TransactGetCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): TransactGetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactGetCommandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactGetCommandOutput] (val x: Self) extends AnyVal {
      
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
