package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactWriteItemsInput extends StObject {
  
  /**
    * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls might not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes. Subsequent TransactWriteItems calls with the same client token return the number of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it is completed. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10-minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.dynamodbMod.ClientRequestToken] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections (if any), that were modified during the operation and are returned in the response. If set to NONE (the default), no statistics are returned. 
    */
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  
  /**
    * An ordered array of up to 25 TransactWriteItem objects, each of which contains a ConditionCheck, Put, Update, or Delete object. These can operate on items in different tables, but the tables must reside in the same AWS account and Region, and no two of them can operate on the same item. 
    */
  var TransactItems: TransactWriteItemList
}
object TransactWriteItemsInput {
  
  @scala.inline
  def apply(TransactItems: TransactWriteItemList): TransactWriteItemsInput = {
    val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactWriteItemsInput]
  }
  
  @scala.inline
  implicit class TransactWriteItemsInputMutableBuilder[Self <: TransactWriteItemsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setTransactItems(value: TransactWriteItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactItemsVarargs(value: TransactWriteItem*): Self = StObject.set(x, "TransactItems", js.Array(value :_*))
  }
}
